package com.example.takasimura.model

import java.io.Serializable

class katalog : Serializable{
    lateinit var nama:String
    lateinit var ukuran:String
    lateinit var diskon:String
    lateinit var harga:String
    lateinit var totalpembayaran:String
    var image:Int = 0
}