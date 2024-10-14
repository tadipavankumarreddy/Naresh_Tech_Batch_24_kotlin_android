package com.nareshtech.scoretrackermvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel {
    var count:MutableLiveData<Int>
    constructor(){
        Log.v("MAIN","ViewModel is created")
        count = MutableLiveData()
        // set the value on the count variable
        count.value = 0
    }

    fun increment(){
        count.value = count.value?.plus(1)
    }

    fun decrement(){
        count.value = count.value?.minus(1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.v("MAIN", "ViewModel is Destroyed")
    }

}