package com.nareshtech.servicesinandroid

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat

// TODO: Create a service class and manage your service here.

class MyForegroundService:Service() {

    lateinit var player: MediaPlayer
    lateinit var nm:NotificationManager

    // This is a mandatory method to implement.
    override fun onBind(intent: Intent?): IBinder? {
        return null!!
    }

    // We set up the service here
    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this, R.raw.my_audio)
        nm = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Logic to perform the foreground service
        if(intent?.action == "MYACTION"){
            // to stop the service
            nm.cancel(32)
            player.stop()
            stopSelf()
        }else{
            player.start()
            sendNotification()
        }
        return START_NOT_STICKY
    }

    private fun sendNotification() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // Create a notification Channel
            val channel = NotificationChannel("Pavan", "Service Notification", NotificationManager.IMPORTANCE_HIGH)
            nm.createNotificationChannel(channel)
        }

        val n = NotificationCompat.Builder(this, "Pavan")
            .setContentTitle("My Foreground Service is started")
            .setContentText("Hello")
            .setSmallIcon(R.drawable.baseline_music_note_24)
            .setAutoCancel(true)
            .build()

        nm.notify(32,n)
    }

}