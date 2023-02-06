package com.example.binlist.data.retrofit.interfaces

import com.example.binlist.data.retrofit.BASE_URL
import com.example.binlist.data.retrofit.models.BinModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitServices {
    @GET("$BASE_URL{bin}")
    fun loadAll(@Path("bin") bin:String): Call<List<BinModel>>
}