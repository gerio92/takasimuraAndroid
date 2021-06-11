package com.example.takasimura

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.takasimura.Fragments.HomeFragment
import com.example.takasimura.Fragments.KeranjangFragment
import com.example.takasimura.app.ApiConfig
import com.example.takasimura.model.ResponseModel
import kotlinx.android.synthetic.main.activity_checkout.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_katalog.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class login : AppCompatActivity() {
    val fargmenthome: Fragment = HomeFragment()
    val fargmentkeranjang : Fragment = KeranjangFragment()
    val fm: FragmentManager = supportFragmentManager
    var active: Fragment = fargmenthome


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        fm.beginTransaction().add(R.id.constraintLayout, fargmenthome). show(fargmenthome).commit()
        fm.beginTransaction().add(R.id.constraintLayout, fargmentkeranjang). show(fargmentkeranjang).commit()

//        btn_login.setOnClickListener{
//            login()
        }

    }

//        fun login(){
//            if (edt_username.text.isEmpty()) {
//                edt_username.error = "Kolom Username Harus Diisi"
//                edt_username.requestFocus()
//                return
//            } else if (edt_password.text.isEmpty()) {
//                edt_password.error = "Kolom Password Harus Diisi"
//                edt_password.requestFocus()
//                return
//            }
//
//            //panggil url
//
//            pb.visibility = View.VISIBLE
//            ApiConfig.instanceRetrofit.login(
//                edt_username.text.toString(),
//                edt_password.text.toString()
//            ).enqueue(object : Callback<ResponseModel> {
//                override fun onResponse(
//                    call: Call<ResponseModel>,
//                    response: Response<ResponseModel>
//                ) {
//                    // handle ketika berhasil
//                    pb.visibility = View.GONE
//                    val respon = response.body()!!
//                    if (respon.success == 1){
//
//                        val intent = Intent(this@MainActivity, HomeFragment::class.java)
//                        startActivity(intent)
//                        //berhasil
//                        Toast.makeText(this@MainActivity,"Success:"+respon.message, Toast.LENGTH_SHORT).show()
//                    } else{
//                        //gagal
//                        Toast.makeText(this@MainActivity,"Error:"+respon.message, Toast.LENGTH_SHORT).show()
//                    }
//                }
//
//                override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
//                    //handle ketika gagal
//                    Toast.makeText(this@MainActivity,"Error:"+t.message, Toast.LENGTH_SHORT).show()
//                }
//
//            })
//        }
//
//
//
////    fun gas(view: View) {
////        val intent = Intent(this, katalog::class.java)
////        startActivity(intent)
////    }
//        fun lalala(view: View) {
//            val intent = Intent(this, daftar::class.java)
//            startActivity(intent)
//        }
//    }