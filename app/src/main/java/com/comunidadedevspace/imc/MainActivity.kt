package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.input_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.input_altura)

        val btnCalcula = findViewById<Button>(R.id.btn_calc)

        btnCalcula.setOnClickListener{
            val peso = edtPeso.text 
            val altura = edtAltura.text
            println(peso )

        }
    }
}