package com.example.tallerpractico1.controller

import com.example.tallerpractico1.model.Empleado

class Controller {
    fun calcularSalario(nombre: String , salarioBase: Double):Double{
        val empleado = Empleado(nombre,salarioBase)
        return empleado.calcularSalarioNeto()
    }
}