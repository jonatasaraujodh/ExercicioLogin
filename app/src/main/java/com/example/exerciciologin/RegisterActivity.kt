package com.example.exerciciologin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

       initComponents()


    }

    private fun initComponents() {
        var nome = findViewById<EditText>(R.id.etRegisterName)
        var email = findViewById<EditText>(R.id.etRegisterEmail)
        var password = findViewById<EditText>(R.id.etRegisterPassword)
        var repassword = findViewById<EditText>(R.id.etRegisterRePassword)
        var botaoRegister = findViewById<Button>(R.id.btRegisterRegister)


        botaoRegister.setOnClickListener {
            if (nome.text.isNullOrEmpty() || email.text.isNullOrEmpty() || password.text.isNullOrEmpty() || password.text.isNullOrEmpty() ){
                Toast.makeText(this, "Campos obrigatórios", Toast.LENGTH_LONG).show()
            }
            else if(!verificaEmail(email)) {
                Toast.makeText(this, "Email Inválido", Toast.LENGTH_LONG).show()
            }else if (!password.text.toString().equals(repassword.text.toString())) {
                Toast.makeText(this, "As senhas informadas não são iguais", Toast.LENGTH_LONG).show()
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