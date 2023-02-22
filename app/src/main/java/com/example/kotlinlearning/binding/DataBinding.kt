package com.example.kotlinlearning.binding

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinlearning.R
import com.example.kotlinlearning.databinding.ActivityDataBindingBinding

class DataBinding : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)
        binding.dataBindingActivityObject = this
        binding.name = "initial"

        //Handling clicks
        handleClicks()

        //Toolbar
        toolBar()
    }

    //Method to handle all types of click
    private fun handleClicks() {

    }

    //method for Data binding
    fun btClickToChangeText()
    {
        binding.name = "Changed"
    }
    //Toolbar
    private fun toolBar() {
        supportActionBar?.title = "Data binding"
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