package com.example.exerciciologin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciologin.model.Prato
import com.squareup.picasso.Picasso

class RestauranteAdapter(
    private val itemList: List<Prato>,
    private val restauranteView: RestauranteActivity
): RecyclerView.Adapter<RestauranteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_prato,parent,false)
        return RestauranteViewHolder(view)
    }

    override fun onBindViewHolder(holderPrato: RestauranteViewHolder, position: Int) {
        Picasso.get().load(itemList[position].itemPicture).into((holderPrato.imgView))
        holderPrato.txtItemTitle.text = itemList[position].itemTitle

        holderPrato.imgView.setOnClickListener({
            val intent = Intent(restauranteView, DetalheActivity::class.java)
            intent.putExtra(KEY_PRATO,itemList[position])
            restauranteView.startActivity(intent)
        })

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    companion object {
        const val KEY_PRATO = "prato"
    }


}