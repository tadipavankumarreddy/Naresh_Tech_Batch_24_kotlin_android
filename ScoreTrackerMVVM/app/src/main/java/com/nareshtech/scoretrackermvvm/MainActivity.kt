package com.nareshtech.scoretrackermvvm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nareshtech.scoretrackermvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // TODO 2: Initialize the Binding library
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // TODO 4: Create a viewmodel
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        if(mainViewModel.count.value!=0){
            binding.result.text = mainViewModel.count.value.toString()
        }
        // TODO 3: handle clicks on buttons
        binding.plusBtn.setOnClickListener {
            mainViewModel.increment()
            /*binding.result.text = mainViewModel.count.toString()*/
        }

        binding.minusBtn.setOnClickListener {
            mainViewModel.decrement()
            /*binding.result.text = mainViewModel.count.toString()*/
        }

        // TODO 5: set up livedata observer
        /*mainViewModel.count.observe(this,{value->
            binding.result.text = value.toString()
        })*/

        mainViewModel.count.observe(this, object:Observer<Int>{
            override fun onChanged(value: Int) {
                binding.result.text = value.toString()
            }

        })
    }
}