package com.nareshit.scoretracker

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var count:Int = 0
    lateinit var res:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        res = findViewById(R.id.result)
        if(savedInstanceState!=null && savedInstanceState.containsKey("COUNT")){
            count = savedInstanceState.getInt("COUNT",0)
            res.text = count.toString()
        }
    }

    fun incrementScore(view: View) {
        // This function gets invoked as the + button is clicked
        count++
        res.text = count.toString()
    }

    fun decrementScore(view: View) {
        // This function gets invoked as the - button is clicked
        count--
        res.text = count.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("COUNT",count)

    }
}