package com.example.tallerpractico1.controller

import com.example.tallerpractico1.View.NoteView

class NoteController(private val view: NoteView) {
    fun calcularPromedio(nombre: String, nota1: Double, nota2: Double, nota3: Double, nota4: Double, nota5: Double) {
        val promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5
        view.mostrarResultado(nombre, promedio)
    }
}