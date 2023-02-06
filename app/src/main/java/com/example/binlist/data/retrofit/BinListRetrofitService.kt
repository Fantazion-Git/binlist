package com.example.binlist.data.retrofit

import com.example.binlist.data.retrofit.models.BinModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

internal const val BASE_URL = "https://lookup.binlist.net/"
object RetrofitDataSource{

    val retrofit: Retrofit by lazy { //TODO пернести
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            ).build()
    }

}