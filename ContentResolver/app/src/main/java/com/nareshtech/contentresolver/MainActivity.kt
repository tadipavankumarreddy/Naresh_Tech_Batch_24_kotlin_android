package com.nareshtech.contentresolver

import android.content.ContentValues
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val CONTENT_URI = "content://com.nareshtech.sqlitedatabases.CONTENT_URI"
    lateinit var textView: TextView
    lateinit var uri: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView = findViewById(R.id.textview)
    }

    fun getData(view: View) {
        // Fetch the data from SQLiteDatabases App.
         uri = Uri.parse(CONTENT_URI)
        textView.setText("")

        val c = contentResolver.query(uri, null,null,null,null,null)
        c?.moveToFirst()
        do{
            val id = c?.getInt(0)
            val name = c?.getString(1)
            val age = c?.getInt(2)
            textView.append("$id $name $age\n")
        }while (c?.moveToNext() == true)
    }

    fun saveData(view: View) {
        val  v = ContentValues()
        v.put("person_name", "Dummy")
        v.put("person_age",23)

        contentResolver.insert(uri,v)
        getData(view)
    }
}