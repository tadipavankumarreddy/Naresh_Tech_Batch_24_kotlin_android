package com.nareshit.powerreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar

class PowerReceiver(val imageView: ImageView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        // TODO 3: "PowerReceiver.onReceive() is not implemented"
        if(intent.action == Intent.ACTION_POWER_CONNECTED){
            imageView.setImageResource(R.drawable.baseline_battery_charging_full_24)
        }else if(intent.action == Intent.ACTION_POWER_DISCONNECTED){
            imageView.setImageResource(R.drawable.baseline_battery_alert_24)
        }else{
            imageView.setImageResource(R.drawable.baseline_face_24)
        }
    }
}