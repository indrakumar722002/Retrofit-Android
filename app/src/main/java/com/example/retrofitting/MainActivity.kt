package com.example.retrofitting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitting.repository.repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: mainViewModel
    private val tag= "Retro"
    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.textview)
        txt.setText("Getting Response... ")
        val repository = repository()
        val viewModelFactory = mainViewModelFactory(repository)
        viewModel= ViewModelProvider(this, viewModelFactory).get(mainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer{ response ->
        txt.setText(response.title)
            Log.d(tag,"Title-->"+response.title)

        })
    }
}