package com.nareshit.favoritemovies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Orientation
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    data class Movies(val images:Int,val title:String,val actors:MutableList<String>)

    lateinit var recyclerview:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // TODO 1: Prepare the data
        val items = prepareData()   // goto this method to understand this
        // TODO 2: Design a template to style all the items on recyclerview
        // TODO 3: Add RecyclerView to your project
        recyclerview = findViewById(R.id.recyclerview)
        // TODO 4: Create an Adapter
        val adapter = MoviesAdapter(this,items)
        recyclerview.adapter = adapter
        // TOOD 5: Set up the Layout Manager
        /*recyclerview.layoutManager = LinearLayoutManager(this)*/
        /*recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)*/
        /*recyclerview.layoutManager = GridLayoutManager(this,2)*/
        recyclerview.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
    }

    private fun prepareData():MutableList<Movies> {
        val movieItems = mutableListOf<Movies>()
        movieItems.add(Movies(R.drawable.a,"A Aa", mutableListOf<String>("Nithin","Samantha")))
        movieItems.add(Movies(R.drawable.b,"Bahubali", mutableListOf<String>("Prabhas","Anushka","Tamannah")))
        movieItems.add(Movies(R.drawable.c,"Cindrella", mutableListOf<String>("Lilly James")))
        movieItems.add(Movies(R.drawable.d,"Dangal", mutableListOf<String>("Aamir Khan")))
        movieItems.add(Movies(R.drawable.e,"Eega", mutableListOf<String>("Nani","Samantha")))
        movieItems.add(Movies(R.drawable.f,"F2", mutableListOf<String>("Venkatesh","Varun Tej")))
        movieItems.add(Movies(R.drawable.g,"Godavari", mutableListOf<String>("Sumanth","Kamilni")))
        movieItems.add(Movies(R.drawable.h,"Housefull", mutableListOf<String>("Akshay Kumar","Deepika")))
        movieItems.add(Movies(R.drawable.i,"Iron Man", mutableListOf<String>("Robert Downy jr")))
        movieItems.add(Movies(R.drawable.j,"The Jungle Book", mutableListOf<String>("Neel Sethi")))
        return movieItems
    }
}