package com.nareshtech.coroutines

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nareshtech.coroutines.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.net.URL
import java.util.Scanner
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    val fetchJokes = "https://api.chucknorris.io/jokes/random"
    lateinit var activityMainBinding: ActivityMainBinding

    // TODO 1: Create a Scope variable to hold the base coroutine context
    lateinit var scope: CoroutineScope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        scope = CoroutineScope(Dispatchers.Main)

        // Do not show the progressbar on the startup
        activityMainBinding.progressBar.visibility = ProgressBar.INVISIBLE
        activityMainBinding.button.setOnClickListener {
            // Write the logic for fetching the data
            fetchData()
        }
    }

    private fun fetchData() {
        activityMainBinding.progressBar.visibility = ProgressBar.VISIBLE
        scope.launch {
            // we are still on main thread only - Dispatchers.Main
            val data = fetchDataAsync()
            try {
                val d = data.await()
                activityMainBinding.textView.text = d
            }catch (e:Exception){
                Toast.makeText(this@MainActivity,"Error",Toast.LENGTH_LONG).show()
            } finally {
                activityMainBinding.progressBar.visibility = ProgressBar.INVISIBLE
            }
        }
    }

    private suspend fun fetchDataAsync(): Deferred<String> = scope.async(Dispatchers.IO) {
        val url = URL(fetchJokes)
        val connection = url.openConnection() as HttpsURLConnection
        val inputStream = connection.inputStream
        val scanner = Scanner(inputStream)
        val stringBuilder = StringBuilder()
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine())
        }
        stringBuilder.toString()
    }
}