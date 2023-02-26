package com.example.tallerpractico1.model

class Empleado(val nombre: String, val salarioBase: Double) {
    fun calcularSalarioNeto(): Double{
        val deducciones =  salarioBase *0.10// deduccion del 10%
        return salarioBase - deducciones
    }
}