package com.nareshit.commonintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
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

    // TODO 1: Get the relevant data when the buttons are clicked.
    // TODO 2: prepare the URI
    // TODO 3: Set up the intent and fire it

    fun openBrowser(view: View) {
        val data = findViewById<TextInputLayout>(R.id.browser_data).editText?.text.toString()
        // TODO 2 -> Implementation
        val uri_data = Uri.parse("https://"+data)
        // TODO 3 -> IMPL
        val i = Intent(Intent.ACTION_VIEW, uri_data)
        startActivity(i)
    }
    fun openDailer(view: View) {
        val data = findViewById<TextInputLayout>(R.id.dailer_data).editText?.text.toString()
        // TODO 2 -> Implementation
        val uri_data = Uri.parse("tel:"+data)
        // TODO 3 -> IMPL
        val i = Intent(Intent.ACTION_DIAL, uri_data)
        startActivity(i)
    }
    fun openMaps(view: View) {
        val data = findViewById<TextInputLayout>(R.id.maps_data).editText?.text.toString()
        // TODO 2 -> Implementation
        val uri_data = Uri.parse("geo:0,0?q="+data)
        // TODO 3 -> IMPL
        val i = Intent(Intent.ACTION_VIEW, uri_data)
        startActivity(i)
    }

    fun openSettings(view: View) {
        val i = Intent(Settings.ACTION_WIFI_SETTINGS)
        startActivity(i)
    }
}