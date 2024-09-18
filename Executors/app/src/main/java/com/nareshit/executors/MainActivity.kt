package com.nareshit.executors

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URL
import java.util.Scanner
import java.util.concurrent.Executors
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    lateinit var textview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textview = findViewById(R.id.textView)
    }

    fun fetchData(view: View) {
        // Create a new single thread executor
        val executor = Executors.newSingleThreadExecutor()

        //Handler to update the UI
        val handler = Handler(Looper.getMainLooper())

        // execute the task
        executor.execute {
            // You already switched to worker thread
            val link = "https://api.chucknorris.io/jokes/random"
            // You can perfrom networking here
            val url = URL(link)
            // Open the connection
            val urlConnection = url.openConnection() as HttpsURLConnection
            // read the inputstream from the url
            val ip = urlConnection.inputStream
            // Use scanner to scrape the data from ip
            val s = Scanner(ip)
            val sb:StringBuilder = StringBuilder()
            do{
                sb.append(s.nextLine())
            }while(s.hasNextLine())

            // Once the network operation is done, you can post the results
            handler.post{
                textview.text = sb.toString()
            }


           /* runOnUiThread(){
              // This can be used to publish results to the UI
                textview.text = sb.toString()
            }*/
        }

        //freeing up the resources
        executor.shutdown()
    }
}