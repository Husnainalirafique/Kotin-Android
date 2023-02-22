package com.example.kotlinlearning

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinlearning.binding.DataBinding
import com.example.kotlinlearning.databinding.ActivityMainBinding
import com.example.kotlinlearning.unitconverter.UnitConverter
import com.example.kotlinlearning.viewmodelcounter.CounterApp

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Function to handle clicks
        handlingClicks()
        // Handling the toolbar
        toolBar()
    }


    //Function to handle clicks
    private fun handlingClicks() {
        binding.unitConverter.setOnClickListener {
            val intent = Intent(this, UnitConverter::class.java)
            startActivity(intent)
        }
        binding.viewModel.setOnClickListener {
            val intent = Intent(this, CounterApp::class.java)
            startActivity(intent)
        }
        binding.dataBinding.setOnClickListener {
            val intent = Intent(this, DataBinding::class.java)
            startActivity(intent)
        }
    }

    //Handling toolBar
    private fun toolBar() {
        supportActionBar?.title = "Kotlin Android"
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#018786")))
    }


}
