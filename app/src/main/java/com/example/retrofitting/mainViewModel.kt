package com.example.retrofitting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitting.model.post

import com.example.retrofitting.repository.repository
import kotlinx.coroutines.launch


class mainViewModel(private val repository: repository): ViewModel() {

    val myResponse: MutableLiveData<post> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = repository.getpost()
            myResponse.value=response
        }

    }
}