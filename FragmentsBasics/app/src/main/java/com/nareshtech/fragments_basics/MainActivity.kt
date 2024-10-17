package com.nareshtech.fragments_basics

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

   /* fun loadFirst(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,FirstFragment())
            .commit()
    }

    fun loadSecond(view: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,SecondFragment())
            .commit()
    }*/
}