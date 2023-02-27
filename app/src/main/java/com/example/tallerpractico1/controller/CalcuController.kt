package com.example.tallerpractico1.controller

class CalcuController {
    fun calcular(num1: Double, num2: Double, operacion: String): Double {
        return when (operacion) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw IllegalArgumentException("Operación inválida")
        }
    }
}