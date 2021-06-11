package com.example.takasimura

import android.content.Intent
import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.takasimura.adapters.KatalogAdapter
import com.example.takasimura.app.ApiConfig
import com.example.takasimura.model.KatalogChar
import com.example.takasimura.model.ResponseModel
import com.example.takasimura.model.katalog
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class katalog : AppCompatActivity() {
    lateinit var rvproduk:RecyclerView

//    private var recyclerView: RecyclerView? = null
//    private var gridLayoutManager: GridLayoutManager? = null
//    private var arrayList: ArrayList<KatalogChar>? = null
//    private var katalogAdapter: KatalogAdapter? = null

//    lateinit var slider: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katalog)

//        val view: View = infla

//    override fun onCreateView(inflater: LayoutInflater, container: DrawableContainer, savedInstancesState: Bundle?): View
//        val view: View = inflater.inflate(R.layout.activity_katalog, container, false)
//        //inflate layout
//        return inflater.inflate(R.layout.activity_katalog)

//        rvproduk = .findView
    }

    //LIST PRODUK TERBARU
//        val arrProduk: ArrayList<katalog>get() {
//        val arr = ArrayList<katalog>()
//            val p1 = katalog()
//            p1.nama = "Jaket Polo"
//            p1.harga = "Rp.150.000"
//            p1.image= R.drawable.gambar1
//
//            val p2 = katalog()
//            p2.nama = "Jaket Polo"
//            p2.harga = "Rp.150.000"
//            p2.image= R.drawable.gambar2
//
//
//            val p3 = katalog()
//            p3.nama = "Jaket Polo"
//            p3.harga = "Rp.150.000"
//            p3.image= R.drawable.gambar3
//
//            arr.add(p1)
//            arr.add(p2)
//            arr.add(p3)
//
//            return arr

        }



//        recyclerView = findViewById(R.id.katalog)
//        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager. VERTICAL, false)
//        recyclerView?.layoutManager = gridLayoutManager
//        recyclerView?.setHasFixedSize(true)
//        arrayList = ArrayList()
////        arrayList = setDatainList()
//        katalogAdapter = KatalogAdapter(applicationContext, arrayList!!)
//        recyclerView?.adapter = katalogAdapter
//
//        getProduk()
//
//
//    }

//   private fun setDatainList(): ArrayList<KatalogChar>? {
//       items.add(KatalogChar(R.drawable.gambar1))
//       items.add(KatalogChar(R.drawable.gambar2))
//       items.add(KatalogChar(R.drawable.gambar3))
//       items.add(KatalogChar(R.drawable.gambar4))
//       items.add(KatalogChar(R.drawable.gambar5))
//       items.add(KatalogChar(R.drawable.gambar6))
//       items.add(KatalogChar(R.drawable.gambar7))
//       items.add(KatalogChar(R.drawable.gambar8))
//       items.add(KatalogChar(R.drawable.gambar9))
//       items.add(KatalogChar(R.drawable.gambar10))
//       items.add(KatalogChar(R.drawable.gambar11))
//       items.add(KatalogChar(R.drawable.gambar12))
//
//       return items
//   }
//      var listproduk:ArrayList<KatalogChar> = ArrayList()
//
//    }
//
//    fun displayproduk(): ArrayList<KatalogChar> {
//                var listproduk:ArrayList<KatalogChar> = ArrayList()
//
//        listproduk.add(KatalogChar(R.drawable.gambar1))
//        listproduk.add(KatalogChar(R.drawable.gambar2))
//        listproduk.add(KatalogChar(R.drawable.gambar3))
//        listproduk.add(KatalogChar(R.drawable.gambar4))
//        listproduk.add(KatalogChar(R.drawable.gambar5))
//        listproduk.add(KatalogChar(R.drawable.gambar6))
//        listproduk.add(KatalogChar(R.drawable.gambar7))
//        listproduk.add(KatalogChar(R.drawable.gambar8))
//        listproduk.add(KatalogChar(R.drawable.gambar9))
//        listproduk.add(KatalogChar(R.drawable.gambar10))
//        listproduk.add(KatalogChar(R.drawable.gambar11))
//        listproduk.add(KatalogChar(R.drawable.gambar12))
//
//        return listproduk
//    }
//    private var listproduk:ArrayList<katalog> = ArrayList()
//    fun getProduk(){
//        ApiConfig.instanceRetrofit.getproduk().enqueue(object : Callback<ResponseModel> {
//            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
//                val res  = response.body()!!
//                if (res.success == 1){
//                    listproduk = res.katalog
//                    displayproduk()
//                }
//
//            }
//
//            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
//                //handle ketika gagal
//            }
//
//        })
//    }
//  fun hehe(view: View){
//val intent = Intent(this,checkout::class.java)
//  }

//fun startActivity(intent: Intent) {
//}
//
//fun katalog(view: View) {
//        val intent = Intent(this, katalog::class.java)
//        startActivity(intent)
//    }
//
//    fun transa(view: View) {
//        val intent = Intent(this, checkout::class.java)
//        startActivity(intent)
//    }
//
//    fun logout(view: View) {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
