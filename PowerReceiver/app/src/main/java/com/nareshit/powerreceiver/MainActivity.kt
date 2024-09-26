package com.nareshit.powerreceiver

import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    companion object{
        val CUSTOM_BROADCAST = "com.nareshit.powerreceiver.CUSTOM_BROADCAST"
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TODO 1: Register for Broadcasts that you want to receive
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        filter.addAction(CUSTOM_BROADCAST)
        imageView = findViewById(R.id.imageView)
        // TODO 2: Use registerReceiver(...) method to complete registration
        registerReceiver(PowerReceiver(imageView),filter, RECEIVER_NOT_EXPORTED)
    }

    fun sendBroadcast(view: View) {
        // TODO 3: send the broadcast
        sendBroadcast(Intent(CUSTOM_BROADCAST))
    }

}