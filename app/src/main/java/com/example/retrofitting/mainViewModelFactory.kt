package com.example.retrofitting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitting.repository.repository

class mainViewModelFactory(
    private val repository: repository):
    ViewModelProvider.Factory
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return mainViewModel(repository) as T
    }

}