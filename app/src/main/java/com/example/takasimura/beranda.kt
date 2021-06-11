package com.example.takasimura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.takasimura.model.beranda
import com.example.takasimura.model.katalog

class beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
    }

    val arrProduk: ArrayList<beranda>get(){
        val arr = ArrayList<beranda>()
        val p1 = beranda()
        p1.nama = "Jaket Polo"
        p1.harga = "150.000"
        p1.gambar = R.drawable.gambar1

        val p2 = beranda()
        p2.nama = "Jaket Polo"
        p2.harga = "150.000"
        p2.gambar = R.drawable.gambar2

        val p3 = beranda()
        p3.nama = "Jaket Polo"
        p3.harga = "150.000"
        p3.gambar = R.drawable.gambar3

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}