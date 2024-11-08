package com.nareshtech.loginfortesting

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        username = findViewById(R.id.userName)
        password = findViewById(R.id.editTextTextPassword)
    }

    fun login(view: View) {
        val uName = username.text.toString()
        val pass = password.text.toString()
        if(isLoginValid(uName, pass)){
            Toast.makeText(this,"Valid", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Invalid", Toast.LENGTH_LONG).show()
        }
    }

    fun isLoginValid(uname:String, pass:String):Boolean{
        return uname == "admin" && pass == "password123"
    }
}