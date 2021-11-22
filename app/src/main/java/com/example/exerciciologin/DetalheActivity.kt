package com.example.exerciciologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.exerciciologin.R
import com.example.exerciciologin.RestauranteAdapter.Companion.KEY_PRATO
import com.example.exerciciologin.model.Prato
import com.squareup.picasso.Picasso

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        initComponents()
    }

    private fun initComponents() {
        val prato: Prato? = intent.getParcelableExtra(KEY_PRATO)

        findViewById<ImageView>(R.id.ivItem).apply {
            Picasso.get().load(prato?.itemPicture).into((this))
        }
        findViewById<TextView>(R.id.tvItemName).text = prato?.itemTitle
        findViewById<TextView>(R.id.tvItemDescription).text = prato?.itemDescription

    }
}