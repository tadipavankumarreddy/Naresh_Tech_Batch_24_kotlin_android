package com.nareshtech.scoretrackermvvm

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel {
    var count:Int = 0
    constructor(){
        Log.v("MAIN","ViewModel is created")
    }

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    override fun onCleared() {
        super.onCleared()
        Log.v("MAIN", "ViewModel is Destroyed")
    }

}