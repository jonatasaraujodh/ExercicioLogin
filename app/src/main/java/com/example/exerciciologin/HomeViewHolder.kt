package com.example.exerciciologin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val imgView: ImageView = itemView.findViewById(R.id.ivMenuItem)
    val txtItemTitle : TextView = itemView.findViewById(R.id.tvMenuItemTitle)
    val txtItemAdress : TextView = itemView.findViewById(R.id.tvMenuItemAdress)
    val txtItemTime : TextView = itemView.findViewById(R.id.tvMenuItemTime)
}