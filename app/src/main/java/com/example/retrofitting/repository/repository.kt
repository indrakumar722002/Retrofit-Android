package com.example.retrofitting.repository

import com.example.retrofitting.api.retrofitInstance
import com.example.retrofitting.model.post

class repository {
    suspend fun getpost(): post{
        return retrofitInstance.api.getpost()

    }
}