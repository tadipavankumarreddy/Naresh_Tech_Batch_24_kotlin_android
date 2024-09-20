package com.nareshit.googlebooks

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.nareshit.googlebooks.datasources.Source

class DisplayBooks(val context: Context, val source:Source): Adapter<DisplayBooks.DisplayVH>() {

    class DisplayVH(v:View):ViewHolder(v){
        val imageView:ImageView = v.findViewById(R.id.book_poster_image)
        val book_title:TextView = v.findViewById(R.id.book_title_tv)
        val book_authors:TextView = v.findViewById(R.id.book_authors_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisplayVH {
        return DisplayVH(LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false))
    }

    override fun getItemCount(): Int {
        return source.items.size
    }

    override fun onBindViewHolder(holder: DisplayVH, position: Int) {
        holder.book_title.text = source.items.get(position).volumeInfo?.title
        val auths = source.items.get(position).volumeInfo?.authors
        holder.book_authors.text = ""
        for(i in 0..auths?.size!!.minus(1))
        {
            holder.book_authors.append("${auths?.get(i)} ")
        }

        //TODO: Load Images
        Glide.with(context)
            .load(source.items.get(position).volumeInfo?.imageLinks?.thumbnail)
            .into(holder.imageView)
    }
}