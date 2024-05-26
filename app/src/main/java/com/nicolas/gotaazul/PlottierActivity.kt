package com.example.bidonesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_plottier.*

class PlottierActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plottier)

        btnAgregarCliente.setOnClickListener {
            val intent = Intent(this, AgregarClienteActivity::class.java)
            startActivity(intent)
        }
    }
}