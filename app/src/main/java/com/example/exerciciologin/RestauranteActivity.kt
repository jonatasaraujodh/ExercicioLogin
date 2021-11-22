package com.example.exerciciologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciologin.HomeAdapter.Companion.KEY_RESTAURATE
import com.example.exerciciologin.model.Restaurante
import com.squareup.picasso.Picasso

class RestauranteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurante)

        initComponents()

    }

    private fun initComponents() {

        val restaurante: Restaurante? = intent.getParcelableExtra(KEY_RESTAURATE)

        findViewById<RecyclerView>(R.id.rvItemSubitemList).apply {
            layoutManager = GridLayoutManager (this@RestauranteActivity,2)
            adapter = restaurante?.lpratoes?.let {
                RestauranteAdapter(it, this.context as RestauranteActivity) }

        }
        findViewById<ImageView>(R.id.ivItem).apply {

            //incluindo imagem na view através da biblioteca Picasso
            Picasso.get().load(restaurante?.itemPicture).into((this))
        }
        findViewById<TextView>(R.id.tvItemName).text = restaurante?.itemTitle
    }

}