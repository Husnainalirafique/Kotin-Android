package com.example.kotlinlearning.unitconverter

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinlearning.databinding.ActivityUnitConverterBinding

class UnitConverter : AppCompatActivity() {
    private lateinit var binding : ActivityUnitConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUnitConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Handling the toolbar
        toolBar()
        //Handling clicks
        handlingClicks()
    }

    //Clicks
    private fun handlingClicks() {
        binding.btCalculateKmToMeter.setOnClickListener {
            if (binding.etToGetKm.text.toString().isEmpty()) {
                binding.etToGetKm.error = "empty"
                binding.etToGetKm.requestFocus()

            } else {
                var km = binding.etToGetKm.text.toString().toDouble()
                val result = km * 1000
                binding.tvShowInMeter.setText(result.toInt().toString())
                binding.etToGetKm.setText("")
            }
        }
    }

    //Toolbar
    private fun toolBar() {
        supportActionBar?.title = "Km To meter"
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
