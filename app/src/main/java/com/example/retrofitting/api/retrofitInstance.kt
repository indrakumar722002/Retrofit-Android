package com.example.retrofitting.api
import com.example.retrofitting.util.constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitInstance {
   private val retrofit by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
   }

    val api: simpleApi by lazy {
        retrofit.create(simpleApi::class.java)
    }
}