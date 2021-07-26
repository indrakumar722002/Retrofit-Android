package com.example.retrofitting.api

import com.example.retrofitting.model.post
import retrofit2.http.GET

interface simpleApi {
    @GET("posts/1")
    suspend fun getpost():post

}