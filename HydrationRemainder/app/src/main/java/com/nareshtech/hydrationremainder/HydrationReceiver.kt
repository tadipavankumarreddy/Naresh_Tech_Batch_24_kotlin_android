package com.nareshtech.hydrationremainder

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.ALARM_SERVICE
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat

class HydrationReceiver : BroadcastReceiver() {

    // This method will be invoked as a new alarm fires up
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val notificationManager:NotificationManager = context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val notificaitonChannel = NotificationChannel("hydration","Hydration Remainder", NotificationManager.IMPORTANCE_HIGH)
            notificationManager.createNotificationChannel(notificaitonChannel)
        }

        val notification = NotificationCompat.Builder(context,"hydration")
            .setSmallIcon(R.drawable.baseline_water_drop_24)
            .setContentTitle("Hydration is needed!")
            .setContentText("Please drink up 200ml of fresh water!")
            .setAutoCancel(true)
            .build()

        notificationManager.notify(234,notification)

    }
}