package com.example.semana16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre= findViewById<EditText>(R.id.edtNombre)
        val boton= findViewById<Button>(R.id.btnSaludar)
        val Saludo=findViewById<TextView>(R.id.txtSaludo)
        val Edad=findViewById<TextView>(R.id.txtEdad)
        boton.setOnClickListener{
            Saludo.text="Hola  ${nombre.text.toString()} tienes ${Edad.text.toString() +" años"}"
        }
    }
}