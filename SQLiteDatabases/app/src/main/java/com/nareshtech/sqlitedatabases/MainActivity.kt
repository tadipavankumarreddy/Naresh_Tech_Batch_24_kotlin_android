package com.nareshtech.sqlitedatabases

import android.content.ContentValues
import android.database.Cursor
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var dbHelper:DBHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val save = findViewById<Button>(R.id.button)
        val load = findViewById<Button>(R.id.button2)

        dbHelper = DBHelper(this,"pavan.db",1)

        save.setOnClickListener { v->
            // Logic for Saving the data
            val til1 = findViewById<TextInputLayout>(R.id.textInputLayout)
            val til2 = findViewById<TextInputLayout>(R.id.textInputLayout2)

            val name = til1.editText?.text?.toString()
            val age = til2.editText?.text?.toString()?.toInt()

            val values = ContentValues()
            values.put(DBHelper.COL_1,name)
            values.put(DBHelper.COL_2, age)

            dbHelper.insertData(values)

            Toast.makeText(this,"Data saved Successfully", Toast.LENGTH_LONG).show()

            til1.editText?.text?.clear()
            til2.editText?.text?.clear()
        }

        load.setOnClickListener { v->
            // Logic for Loading the data
            val c:Cursor = dbHelper.getData()
            // now go through the cursor and retrieve all the data
            val tv:TextView = findViewById(R.id.textView)
            tv.setText("")
            c.moveToFirst()
            do{
                val id = c.getInt(0)
                val name = c.getString(1)
                val age = c.getInt(2)
                tv.append("$id $name $age\n")
            }while (c.moveToNext())
        }
    }
}