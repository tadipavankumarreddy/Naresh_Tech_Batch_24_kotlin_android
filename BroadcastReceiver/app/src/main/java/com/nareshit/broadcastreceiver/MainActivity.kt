package com.nareshit.broadcastreceiver

import android.content.IntentFilter
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        val CUSTOM_BROADCAST = "com.nareshit.powerreceiver.CUSTOM_BROADCAST"
    }
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        tv = findViewById(R.id.textview)

        // Register for the broadcast
        val filter = IntentFilter(CUSTOM_BROADCAST)
        registerReceiver(MyCustomReceiver(tv),filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(MyCustomReceiver(tv))
    }
}