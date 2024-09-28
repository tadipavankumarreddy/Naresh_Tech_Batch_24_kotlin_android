package com.nareshit.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyCustomReceiver(val tv:TextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if(intent.action == MainActivity.CUSTOM_BROADCAST){
            tv.setText("Received")
        }
    }
}