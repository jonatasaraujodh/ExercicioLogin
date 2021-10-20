package com.example.exerciciologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {


    private lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        botao = findViewById(R.id.btLoginRegister)

        botao.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

    }
}