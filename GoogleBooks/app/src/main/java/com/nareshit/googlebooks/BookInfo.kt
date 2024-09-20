package com.nareshit.googlebooks

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request.Method
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.nareshit.googlebooks.datasources.*

class BookInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_book_info)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val query = intent.getStringExtra("QUERY")

        // TODO 1: Perform networking using Volley
            // TODO 1.1: Add dependency
            // TODO 1.2: create a new RequestQueue
        val queue = Volley.newRequestQueue(this)

        val link = "https://www.googleapis.com/books/v1/volumes?q=$query"
        // TODO 1.3: Create a StringRequest
        val stringRequest = StringRequest(Method.GET,link,
            { response: String? ->
                // Write logic for successful response
                // TODO 2: Parse the JsonResponse
                // TOOD 2.1: Add Gson Dependency
                // TODO 2.2: Use GOSn to parse your JSOn
                val g = Gson()
                val s:Source =
                    g.fromJson(response,Source::class.java)
                val pb = findViewById<ProgressBar>(R.id.progressBar4)
                pb.visibility = View.INVISIBLE
                val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
                val d:DisplayBooks = DisplayBooks(this,s)
                recyclerView.adapter = d
                recyclerView.layoutManager =
                    LinearLayoutManager(this)
        }, {
            // write logic for unsuccesful response
        })

        // TODO 1.4 Add this stringRequest to the queue
        queue.add(stringRequest)
    }
}