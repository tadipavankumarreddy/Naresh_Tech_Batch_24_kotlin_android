package com.nareshit.intents

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

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

    fun giveSurprise(view: View) {
        // TODO 3.1 When the button is clicked, you need to read data
        val til:TextInputLayout = findViewById(R.id.textInputLayout)
        if(til.editText?.text.toString().equals("")){
            til.editText?.setError("Sorry, you need to enter your name")
        }else{
            val name:String = til.editText?.text.toString()
            // TODO 3.2 Create an Intent (Explicit) that takes the user from MainActivity.kt to SecondActivity.kt
            val i:Intent = Intent(this,SecondActivity::class.java)
            // TODO 3.3 Associate the data with the intent object.
            i.putExtra("DATA",name)
            // TODO 3.4 Start the activity with intent object
            startActivity(i)
        }
    }
}

// TODO 1: Create a new Activity in the Project
/**
 * go to file ->
 * new ->
 * activity ->
 * EmptyViewsActivity*/
// TODO 2: Design the SecondActivity in your project
// TODO 3: Create an Intent and also send data along with it to the secondactivity.