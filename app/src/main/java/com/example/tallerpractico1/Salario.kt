package com.example.tallerpractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.annotation.SuppressLint
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tallerpractico1.controller.Controller

class Salario : AppCompatActivity() {
    private lateinit var nombreEditText: EditText
    private lateinit var salarioEditText: EditText
    private lateinit var calcularButton: Button
    private lateinit var resultadoTextView: TextView
    private lateinit var controlador: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salario)
        nombreEditText = findViewById(R.id.etnombre)
        salarioEditText = findViewById(R.id.etsalario)
        calcularButton = findViewById(R.id.btncalcular)
        resultadoTextView = findViewById(R.id.tvresultado)

        calcularButton.setOnClickListener{
            val nombre = nombreEditText.text.toString()
            val salarioBase = salarioEditText.text.toString().toDouble()
            val salarioNeto = controlador.calcularSalario(nombre,salarioBase)
            val resultado = "El pago total de  $nombre es $salarioNeto"
            resultadoTextView.text =resultado

        }
    }
}