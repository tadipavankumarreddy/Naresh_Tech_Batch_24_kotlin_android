package com.nareshtech.firebasertdb

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tin: TextInputLayout
    lateinit var tia: TextInputLayout
    lateinit var progressBar: ProgressBar
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initializeUIComponents()
        progressBar.visibility = ProgressBar.INVISIBLE
    }


    fun saveData(view: View) {
        progressBar.visibility = ProgressBar.VISIBLE
        val name:String = tin.editText?.text.toString()
        val age:Int = tia.editText?.text.toString().toInt()
        val user:User = User(name,age)

        // TODO 1: Set up the firebase Project and enable the real time databases feature.
        // TODO 2: Push the data to firebase
    }

    fun loadData(view: View) {
        progressBar.visibility = ProgressBar.VISIBLE
    }

    data class User(val name:String, val age:Int)

    private fun initializeUIComponents() {
        tin = findViewById(R.id.textInputName)
        tia = findViewById(R.id.textInputAge)
        result = findViewById(R.id.result)
        progressBar = findViewById(R.id.progressBar)
    }
}