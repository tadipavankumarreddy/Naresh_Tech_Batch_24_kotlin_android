package com.nareshit.sharedpreferences

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var personName:TextInputLayout
    lateinit var age:TextInputLayout
    lateinit var button: Button
    lateinit var button2:Button
    lateinit var textView: TextView

    // TODO 1: Create a sharedpreferences object
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        personName = findViewById(R.id.textInputLayout)
        age = findViewById(R.id.textInputLayout2)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        textView = findViewById(R.id.textView)

        sharedPreferences = getSharedPreferences("my_prefs", MODE_PRIVATE)

        button.setOnClickListener { v->
            handleButtonClick(v.id)
        }

        button2.setOnClickListener { v->
            handleButtonClick(v.id)
        }
    }

    private fun handleButtonClick(id: Int) {
        // Here you differentiate the button and perform your task
        if(id == R.id.button){
            // TODO 2: save the data
            val editor:SharedPreferences.Editor = sharedPreferences.edit()
            val name = personName.editText?.text.toString()
            val a = age.editText?.text.toString().toInt()
            editor.putString("NAME",name)
            editor.putInt("AGE",a)
            // call .apply method on editor otherwise your modifications will not be reflected on sharedpreferences
            editor.apply()

            personName.editText?.text?.clear()
            age.editText?.text?.clear()
            Snackbar.make(personName,"Data Saved", Snackbar.LENGTH_LONG).show()
        }else{
            // load the data
            val n = sharedPreferences.getString("NAME","def")
            val a = sharedPreferences.getInt("AGE",123)
            textView.text = "$n $a"
        }
    }
}