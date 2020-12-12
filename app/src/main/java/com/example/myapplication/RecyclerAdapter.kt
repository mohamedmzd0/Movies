package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemMovieBinding

class RecyclerAdapter(
    var
    contxt: Context?,
    var
    result: List<Result>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    class ViewHolder(itemView: ItemMovieBinding) : RecyclerView.ViewHolder(itemView.root) {
        val itemMovie: ItemMovieBinding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return result!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemMovie.tvTitle.text = result.get(position).original_title

Glide.with(contxt!!).load("http://image.tmdb.org/t/p/w342"+result.get(position).poster_path)
    .into(holder.itemMovie.imageview)
    }
}