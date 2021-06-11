package com.example.takasimura

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.takasimura.katalog
import com.example.takasimura.model.ResponseModel
import kotlinx.android.synthetic.main.activity_checkout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.nio.file.DirectoryIteratorException

class checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)


        val mAlertDialogBtn = findViewById<Button>(R.id.pesan)

        pesan.setOnClickListener {
            val mAlertDialog = AlertDialog.Builder(this@checkout)
            mAlertDialog.setTitle("Lakukan Pemesanan")
            mAlertDialog.setMessage("Apakah Data Yang Dimasukkan Sudah Benar")
            mAlertDialog.setIcon(R.drawable.ic_baseline_shopping_cart_24)
            mAlertDialog.setPositiveButton("Iya") { dialog: DialogInterface, id ->
                Toast.makeText(this@checkout, "Pesanan Segera Diproses", Toast.LENGTH_SHORT).show()
            }
            mAlertDialog.setNegativeButton("Tidak") { dialog: DialogInterface, id ->
                dialog.dismiss()
            }
            mAlertDialog.show()
        }
    }
}
//        getInfo()
//    }
//    ApiConfig.instanceRetrofit.getproduk().enqueue(object : Callback<ResponseModel> {
//        override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
//            val res  = response.body()!!
//            if (res.success == 1){
//                fun getInfo(){
//                    val nama = intent.getStringExtra("nama")
//                    val ukuran = intent.getStringExtra("ukuran")
//                    val diskon = intent.getStringExtra("diskon")
//                    val harga = intent.getStringExtra("harga")
//                    val totalpembayaran = intent.getStringExtra("totalpembayaran")
//                    val image = intent.getStringExtra("image")
//                    //set value
//                    t_nama.text = nama
//                    t_ukuran.text = ukuran
//                    t_diskon.text =diskon
//                    t_harga.text = harga
//                    t_total.text = totalpembayaran
//
//                }
//            }
//
//        }
//
//        override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
//            //handle ketika gagal
//        }
//
//    })


//    fun kataloga(view: View) {
//        val intent = Intent(this, katalog::class.java)
//        startActivity(intent)
//    }
//
//    fun transass(view: View) {
//        val intent = Intent(this, checkout::class.java)
//        startActivity(intent)
//    }
//
//    fun logoutu(view: View) {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
//}