package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)


        tvResult.text = result.toString()

        val classificacao: String
        val colorId: Int

        when {
            result <= 18.5f -> {
                classificacao = "MAGREZA"
                colorId = R.color.MAGREZA
            }
            result <= 18.5f && result <= 24.9f -> {
                classificacao = "NORMAL"
                colorId = R.color.NORMAL
            }
            result <= 25f && result <= 29.9f -> {
                classificacao = "SOBREPESO"
                colorId = R.color.SOBREPESO
            }
            result <= 30f && result <= 39.9f -> {
                classificacao = "OBESIDADE"
                colorId = R.color.OBESIDADE
            }
            else -> {
                classificacao = "PROCURE UM MEDICO"
                colorId = R.color.GRAVE
            }

        }

        tvClassificacao.text = classificacao
        tvClassificacao.setTextColor(ContextCompat.getColor(this,colorId))

    }
}
