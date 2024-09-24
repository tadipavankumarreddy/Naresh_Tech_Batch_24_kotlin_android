package com.nareshit.notifications

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    // TODO 1: Create a notificationManager
    lateinit var manager:NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TODO 2: Initialize the NotificationManager
        manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
    }

    fun handleNotification(view: View) {

        if(view.id == R.id.button){
            // Send Notification button
           // TODO 3: Create a Notification Channel for the devices running android 8.0 & Above
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
                // Need to create notification channel
                val channel = NotificationChannel("my_channel", "My Noti Channel"
                    ,NotificationManager.IMPORTANCE_HIGH)
                manager.createNotificationChannel(channel)
            }

            // TODO 4: Create a notification and send it
            val notification: Notification = NotificationCompat.Builder(this,"my_channel")
                .setSmallIcon(R.drawable.baseline_beach_access_24)
                .setContentTitle("Hello!")
                .setContentText("How are you doing? I'm here for you")
                .setAutoCancel(true)
                .setPriority(Notification.PRIORITY_HIGH)
                .build()

            manager.notify(43,notification)
        }else{
            // cancel notification button

        }
    }
}