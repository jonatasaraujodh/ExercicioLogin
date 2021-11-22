package com.example.exerciciologin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciologin.model.Restaurante
import com.squareup.picasso.Picasso

class HomeAdapter(
    private val itemList: List<Restaurante>,
    private val homeView: HomeActivity
): RecyclerView.Adapter<HomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holderRestaurante: HomeViewHolder, position: Int) {

        Picasso.get().load(itemList[position].itemPicture).into((holderRestaurante.imgView))
        holderRestaurante.txtItemTitle.text = itemList[position].itemTitle
        holderRestaurante.txtItemAdress.text = itemList[position].itemAdress
        holderRestaurante.txtItemTime.text = itemList[position].itemTime

        holderRestaurante.imgView.setOnClickListener(View.OnClickListener {
            val intent = Intent(homeView, RestauranteActivity::class.java)
            intent.putExtra(KEY_RESTAURATE,itemList[position])
            homeView.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

    companion object {
        const val KEY_RESTAURATE = "restaurante"
    }

}