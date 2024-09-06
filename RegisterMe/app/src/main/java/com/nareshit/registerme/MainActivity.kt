package com.nareshit.registerme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //TODO 1: Create an Object (reference) to all the views on the activity_main.xml
    lateinit var person_name:EditText
    lateinit var person_age:EditText
    lateinit var gender:RadioGroup
    lateinit var telugu:CheckBox
    lateinit var hindi:CheckBox
    lateinit var english:CheckBox
    lateinit var country:Spinner
    lateinit var availale:SwitchCompat
    lateinit var result:TextView
    lateinit var button:Button
    var g:String = "Male"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initalizeViews()

        // TODO 3: Start reading the data as the user enters it
       /*button.setOnClickListener(object : View.OnClickListener() {
           override fun onClick(p0: View?) {
               // functionality
           }
       } )*/
        button.setOnClickListener {
            v->
            // TODO 4: Read Data from the edittext boxes
            var name:String = ""
            var age:Int = 0
            if(datavalidated()){
                name = person_name.text.toString()
                age = person_age.text.toString().toInt()
            }

            // TODO 6: Read data from checkboxes
            var lang : String = ""
            if(telugu.isChecked){
                lang += "Telugu\t"
            }

            if(hindi.isChecked){
                lang += "Hindi\t"
            }

            if(english.isChecked){
                lang += "English\t"
            }
            result.text = "$name \n$age \n$g \n$lang"

            // TODO 7: Read the data from spinner
            // TODO 8: Read the data from SwitchCompat

        }

        // TODO 5: Read data from radio group
        gender.setOnCheckedChangeListener { radioGroup, i ->
            if(R.id.male == i){
                g = "Male"
            }

            if(R.id.female == i){
                g = "Female"
            }
        }

    }

    private fun datavalidated(): Boolean {
        if(person_name.text.toString().isEmpty()){
            person_name.setError("Please enter data")
            return false
        }

        if(person_age.text.toString().isEmpty()){
            person_age.setError("Please enter data")
            return false
        }

        return true
    }

    private fun initalizeViews() {
        // TODO 2: Initialize the views references created in TODO 1
        person_name = findViewById(R.id.editTextText)
        person_age = findViewById(R.id.editTextNumber)
        gender = findViewById(R.id.gender)
        telugu = findViewById(R.id.telugu)
        hindi = findViewById(R.id.hindi)
        english = findViewById(R.id.english)
        country = findViewById(R.id.nationality)
        availale = findViewById(R.id.available)
        result = findViewById(R.id.result)
        button = findViewById(R.id.button)
    }
}