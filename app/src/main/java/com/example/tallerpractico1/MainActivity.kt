package com.example.tallerpractico1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tallerpractico1.controller.Controller

class MainActivity : AppCompatActivity() {
    private lateinit var nombreEditText: EditText
    private lateinit var salarioEditText: EditText
    private lateinit var calcularButton: Button
    private lateinit var resultadoTextView: TextView
    private lateinit var controlador: Controller
    //@SuppressLint("MissingInflatedId")
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombreEditText = findViewById(R.id.etnombre)
        salarioEditText = findViewById(R.id.etsalario)
        calcularButton = findViewById(R.id.btncalcular)
        resultadoTextView = findViewById(R.id.tvresultado)

        calcularButton.setOnClickListener{
            val nombre = nombreEditText.text.toString()
            val salarioBase = salarioEditText.text.toString().toDouble()
            val salarioNeto = controlador.calcularSalario(nombre,salarioBase)
            resultadoTextView.text = "El salario neto de $nombre es $salarioNeto"
        }
    }
}