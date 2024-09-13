package com.nareshit.favoritemovies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

/**
 * Recyclerview adapter is complex.
 * Why because, the recyclerview adapter has another component called ViewHolder
 * Steps to Implement:
 *  1. First create an innerclass for the ViewHolder
 *  2. Extend the adapter class to Recyclerview Adapter
 *  3. Implement the unimplemented methods on the Adapter*/


class MoviesAdapter(val context:Context, val movieItems:MutableList<MainActivity.Movies>)
    :Adapter<MoviesAdapter.MoviesViewHolder>(){

    inner class MoviesViewHolder(v:View): ViewHolder(v){
        // You will handle the view connections for each item.
        // meaning, you connect an object to movie_poster, another one to movie_title and etc.,
        val imageView:ImageView = v.findViewById(R.id.movie_poster)
        val movieTitle:TextView = v.findViewById(R.id.movie_name)
        val movieActors:TextView = v.findViewById(R.id.actor_names)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        // this is responsible to connect the one_item_design to a item on recyclerview
        val v:View = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false)
        return MoviesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return movieItems.size
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        // This is where we load data
        holder.imageView.setImageResource(movieItems.get(position).images)
        holder.movieTitle.text = movieItems.get(position).title
        holder.movieActors.text = ""
        for(i in movieItems.get(position).actors){
            holder.movieActors.append("$i ")
        }
    }
}