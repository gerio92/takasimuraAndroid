package com.example.takasimura.app

import com.example.takasimura.model.ResponseModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    //Daftar Akun
    @FormUrlEncoded
    @POST("register") //"http://127.0.0.1:8000/api/"
    fun register(
            @Field("name") nama :String,
            @Field("email") email :String,
            @Field("password") password :String,
    ) :Call<ResponseModel>

    //login

    @FormUrlEncoded
    @POST("login") //"http://127.0.0.1:8000/api/login"
    fun login(
        @Field("email") email :String,
        @Field("password") password :String,
    ) :Call<ResponseModel>

    //Katalog insyaallah
    @GET ("produk")
    fun getproduk():Call<ResponseModel>
}