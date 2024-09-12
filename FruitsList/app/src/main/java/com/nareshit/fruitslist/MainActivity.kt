package com.nareshit.fruitslist

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // TODO 1: Create a ListView Object
    lateinit var listview:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TODO 1
        listview = findViewById(R.id.fruits_list)

        // TODO 2: Prepare Data (list of Fruits)
        var fLists = mutableListOf("Apple","Avacado", "Guava","Mango","Water melon","Papaya","Grapes")

        // TODO 3: Display this data on ListView with the help of an Adapter
        val adapter:ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fLists)
        listview.adapter = adapter

        // TODO 4: Customizing the ListView
        // TODO 4.1 -> Collect Data
        var iLists = mutableListOf<Int>(R.drawable.a, R.drawable.av, R.drawable.g,
            R.drawable.m, R.drawable.wm, R.drawable.p, R.drawable.gr)
        // TODO 4.2 -> Create your own layout
        // TODO 4.3 -> Create an Adapter class
        // TODO 4.4 -> Use this Adapter to populate data on ListView
        val fa:FruitsAdapter = FruitsAdapter(this,fLists,iLists)
        listview.adapter = fa

        // TODO 5: Get the items click listening
        listview.setOnItemClickListener { parent, view, position, id ->
            Snackbar.make(view,fLists.get(position),Snackbar.LENGTH_LONG).show()
        }
    }

    class FruitsAdapter(val context:Context,val fLists:List<String>, val iLists:List<Int>):BaseAdapter() {
        override fun getCount(): Int {
            return 7
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val v: View =
                LayoutInflater.from(context).inflate(R.layout.one_item_design, parent, false)
            val image: ImageView = v.findViewById(R.id.imageView)
            val text: TextView = v.findViewById(R.id.textView)
            image.setImageResource(iLists.get(position))
            text.text = fLists.get(position)
            return v
        }
    }

}