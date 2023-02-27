package com.example.tallerpractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import com.example.tallerpractico1.controller.CalcuController

class CalculadoraMain : AppCompatActivity() {

    private lateinit var etNum1: EditText
    private lateinit var etNum2: EditText
    private lateinit var cbSuma: CheckBox
    private lateinit var cbResta: CheckBox
    private lateinit var cbMultiplicacion: CheckBox
    private lateinit var cbDivision: CheckBox
    private lateinit var btnCalcular: Button
    private lateinit var tvResultado: TextView

    private val calculadoraController = CalcuController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_main)

        etNum1 = findViewById(R.id.et_num1)
        etNum2 = findViewById(R.id.et_num2)
        cbSuma = findViewById(R.id.cb_suma)
        cbResta = findViewById(R.id.cb_resta)
        cbMultiplicacion = findViewById(R.id.cb_multiplicacion)
        cbDivision = findViewById(R.id.cb_division)
        btnCalcular = findViewById(R.id.btn_calcular)
        tvResultado = findViewById(R.id.tv_resultado)

        btnCalcular.setOnClickListener {
            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()
            var operacion = ""
            if (cbSuma.isChecked) {
                operacion = "+"
            } else if (cbResta.isChecked) {
                operacion = "-"
            } else if (cbMultiplicacion.isChecked) {
                operacion = "*"
            } else if (cbDivision.isChecked) {
                operacion = "/"
            }
            val resultado = calculadoraController.calcular(num1, num2, operacion)
            tvResultado.text = resultado.toString()
        }
    }
}