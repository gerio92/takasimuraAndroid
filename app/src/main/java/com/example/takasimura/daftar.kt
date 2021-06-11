package com.example.takasimura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.takasimura.app.ApiConfig
import com.example.takasimura.model.ResponseModel
import kotlinx.android.synthetic.main.activity_daftar.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)


        btn_register.setOnClickListener {
            register()
        }
    }

//pengisian data

    fun register() {
        if (edt_nama.text.isEmpty()) {
            edt_nama.error = "Kolom Nama Harus Diisi"
            edt_nama.requestFocus()
            return
        } else if (edt_username.text.isEmpty()) {
            edt_username.error = "Kolom Username Harus Diisi"
            edt_username.requestFocus()
            return
        } else if (edt_password.text.isEmpty()) {
            edt_password.error = "Kolom Password Harus Diisi"
            edt_password.requestFocus()
            return
        }

        //panggil url
        ApiConfig.instanceRetrofit.register(
            edt_nama.text.toString(),
            edt_username.text.toString(),
            edt_password.text.toString()
        ).enqueue(object : Callback<ResponseModel> {
            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                // handle ketika berhasil
//                Toast.makeText(this@daftar,"Success:", Toast.LENGTH_SHORT).show()
                val respon = response.body()!!

                if (response.body()!!.success == 1){
                    val intent = Intent(this@daftar, login::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    finish()
                    //berhasil
                    Toast.makeText(this@daftar,"Success:"+respon.message, Toast.LENGTH_SHORT).show()
                } else{
                    //gagal
                    Toast.makeText(this@daftar,"Error:"+respon.message, Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                //handle ketika gagal
                Toast.makeText(this@daftar,"Error:"+t.message, Toast.LENGTH_SHORT).show()
            }

        })

    }
}