package com.example.tallerpractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import com.example.tallerpractico1.controller.NoteController
import com.example.tallerpractico1.View.NoteView

class NoteMainActivity : AppCompatActivity(), NoteView {

    private lateinit var controlador: NoteController
    private lateinit var edtNombre: EditText
    private lateinit var edtNota1: EditText
    private lateinit var edtNota2: EditText
    private lateinit var edtNota3: EditText
    private lateinit var edtNota4: EditText
    private lateinit var edtNota5: EditText
    private lateinit var btnCalcularPromedio: Button
    private lateinit var txtResultado: TextView
    private lateinit var txtAprobado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_main)

        controlador = NoteController(this)

        edtNombre = findViewById(R.id.edt_nombre)
        edtNota1 = findViewById(R.id.edt_nota1)
        edtNota2 = findViewById(R.id.edt_nota2)
        edtNota3 = findViewById(R.id.edt_nota3)
        edtNota4 = findViewById(R.id.edt_nota4)
        edtNota5 = findViewById(R.id.edt_nota5)
        btnCalcularPromedio = findViewById(R.id.btn_calcular_promedio)
        txtResultado = findViewById(R.id.txt_resultado)
        txtAprobado = findViewById(R.id.txt_aprobado)

        btnCalcularPromedio.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val nota1 = edtNota1.text.toString().toDouble()
            val nota2 = edtNota2.text.toString().toDouble()
            val nota3 = edtNota3.text.toString().toDouble()
            val nota4 = edtNota4.text.toString().toDouble()
            val nota5 = edtNota5.text.toString().toDouble()

            controlador.calcularPromedio(nombre, nota1, nota2, nota3, nota4, nota5)
        }
    }

    override fun mostrarResultado(nombre: String, promedio: Double) {
        val resultado = "El promedio de $nombre es $promedio"
        txtResultado.text = resultado

        val estado = if (promedio >= 6.0) "Aprobado" else "Reprobado"
        txtAprobado.text = estado
    }
}