package com.example.retrofit

import com.example.retrofit.models.BinModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

object RetrofitProviderProvider {
    fun getRetrofitProvider():
            RetrofitProvider = RetrofitProviderImpl()
}

interface RetrofitProvider {
    val retrofit: Retrofit
}
private const val BASE_URL = "https://lookup.binlist.net/"
internal class RetrofitProviderImpl : RetrofitProvider {

    override val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            ).build()
    }

}
interface BinListRetrofitService{
    @GET("${BASE_URL}{bin}")
    fun loadAll(@Path("bin") bin:String): Call<List<BinModel>>
}