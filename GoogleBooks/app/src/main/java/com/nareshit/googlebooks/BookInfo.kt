package com.nareshit.googlebooks

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Request.Method
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

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
        }, {
            // write logic for unsuccesful response
        })

        // TODO 1.4 Add this stringRequest to the queue
        queue.add(stringRequest)
    }
}