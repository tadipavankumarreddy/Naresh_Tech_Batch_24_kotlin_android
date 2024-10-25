package com.nareshtech.humanroomdatabase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import com.nareshtech.humanroomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    lateinit var humanDatabase: HumanDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityMainBinding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TODO 1: Initialize the database
        humanDatabase = Room.databaseBuilder(this, HumanDatabase::class.java,"pavan")
            .allowMainThreadQueries()
            .build()

        // TODO 4: updating the database
        /*val human:Human = Human(1, "Pavan", 40)
        humanDatabase.humanDao().updateRow(human)*/

        // TODO 2: Insert the data to the database
        activityMainBinding.button.setOnClickListener {
            // logic for saving the data
            val name:String = activityMainBinding.textInputName.editText?.text.toString()
            val age:Int = activityMainBinding.textInputAge.editText?.text.toString().toInt()
            val human = Human(0,name, age)
            humanDatabase.humanDao().insertData(human)

            activityMainBinding.textInputName.editText?.text?.clear()
            activityMainBinding.textInputAge.editText?.text?.clear()
        }

        // TODO 3: Retrieve the data from the database
        activityMainBinding.button2.setOnClickListener {
             val humanList:List<Human> = humanDatabase.humanDao().getAllData()
            activityMainBinding.result.text = ""
            for(i in humanList){
                activityMainBinding.result.append("${i.human_id} ${i.human_name} ${i.human_age}\n\n")
            }
        }
    }
}