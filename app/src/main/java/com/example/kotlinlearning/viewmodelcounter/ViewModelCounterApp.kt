package com.example.kotlinlearning.viewmodelcounter

import androidx.lifecycle.ViewModel

class ViewModelCounterApp : ViewModel() {
    var count = 0
    fun increaseCount() {
        count++
    }
}