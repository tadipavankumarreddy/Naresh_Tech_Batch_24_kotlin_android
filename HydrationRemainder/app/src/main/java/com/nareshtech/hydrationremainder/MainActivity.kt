package com.nareshtech.hydrationremainder

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var alarmManager:AlarmManager
    lateinit var pi:PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        pi = PendingIntent.getBroadcast(this,12,
            Intent(this,HydrationReceiver::class.java),
            PendingIntent.FLAG_IMMUTABLE)
    }

    fun setRemainder(view: View) {
        // TODO 3.1: You need a pending intent object that delivers a broadcast
        // TODO 3.2: set up all the four arguments that needs to be given to setInExactRepeating(...)
        val alarmType = AlarmManager.ELAPSED_REALTIME
        val firstTriggerTime:Long = SystemClock.elapsedRealtime()
        val intervalTime:Long = 60*1000
        alarmManager.setInexactRepeating(alarmType, firstTriggerTime, intervalTime, pi)
    }

    fun turnOffRemainder(view: View) {
        alarmManager.cancel(pi)
    }

    // TODO 1: Create a broadcast Receiver to trigger notifications to the user every 2 minutes.
    // TODO 2: set up the alarm for which you need an AlarmManger
    // TODO 3: when the set remainder button is clicked, schedule an alarm using setInExactRepeating(...)

}