package com.aplicaion.minimarketapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import android.widget.TextView

class inicio_sesion : AppCompatActivity() {
    private lateinit var btnIngresar : MaterialButton
    private lateinit var btnRegistro_usuario: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio_sesion)
        btnIngresar= findViewById(R.id.btnIngresar)
        btnIngresar.setOnClickListener {
            var intent = Intent(this, registro_usuario::class.java)
            startActivity(intent)
        }
        btnRegistro_usuario= findViewById(R.id.btnRegistroUsuario)
        btnRegistro_usuario.setOnClickListener  {
            var intent = Intent(this, registro_usuario::class.java)
            startActivity(intent)
        }
        btnIngresar= findViewById(R.id.btnIngresar)
        btnIngresar.setOnClickListener{
            var intent = Intent(this,punto_venta::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}