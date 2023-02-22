package com.example.kotlinlearning.viewmodelcounter

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinlearning.databinding.ActivityViewModelCounterEgBinding

class CounterApp : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelCounterEgBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelCounterEgBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Clicks
        handlingClicks()
        //toolBar
        toolBar()

    }

    private fun handlingClicks() {
        //creating object of view-model
        var viewModel = ViewModelProvider(this)[ViewModelCounterApp::class.java]

        // Code to increase the value by 1
        binding.countView.text = viewModel.count.toString()

        binding.btCountIncrease.setOnClickListener {
            viewModel.increaseCount()
            binding.countView.text = viewModel.count.toString()
        }


    }

    //Toolbar
    private fun toolBar() {
        supportActionBar?.title = "ViewModel"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#018786")))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    //To Handle back button on toolbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}