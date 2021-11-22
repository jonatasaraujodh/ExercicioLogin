package com.example.exerciciologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isVisible

class LoginActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initComponents()

    }

    private fun initComponents() {

        var email = findViewById<EditText>(R.id.etLoginEmail)
        var password = findViewById<EditText>(R.id.etLoginPassword)
        var botaoRegister = findViewById<Button>(R.id.btLoginRegister)
        var botaoLogin = findViewById<Button>(R.id.btLoginLogin)


        botaoRegister.setOnClickListener {
            val intent = Intent (this, RegisterActivity::class.java)
            startActivity(intent)
        }
        botaoLogin.setOnClickListener {
            if (email.text.isNullOrEmpty() || password.text.isNullOrEmpty()){
                Toast.makeText(this, "Campos obrigatórios", Toast.LENGTH_LONG).show()
            }
            else if(!verificaEmail(email)) {
                Toast.makeText(this, "Email Inválido", Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }

    private fun verificaEmail(email: EditText): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email.text).matches()
    }
}