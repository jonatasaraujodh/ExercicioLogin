package com.example.exerciciologin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestauranteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val imViewTitle: ImageView? = itemView.findViewById(R.id.ivItem)

    val imgView: ImageView = itemView.findViewById(R.id.ivMenuItem)
    val txtItemTitle : TextView = itemView.findViewById(R.id.tvMenuItemTitle)
}