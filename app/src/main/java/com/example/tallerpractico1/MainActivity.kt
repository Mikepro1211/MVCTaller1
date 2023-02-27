package com.example.tallerpractico1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tallerpractico1.controller.Controller

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.buttonNota)
        val btn2 = findViewById<Button>(R.id.buttonSalario)
        val btn3 = findViewById<Button>(R.id.buttonCalculadora)

        btn1.setOnClickListener{
           val intent01 = Intent(this,NoteMainActivity::class.java)
            startActivity(intent01)
        }
        btn2.setOnClickListener{
            val intent02 = Intent(this,Salario::class.java)
            startActivity(intent02)
        }
        btn3.setOnClickListener{
            val intent03 = Intent(this,CalculadoraMain::class.java)
            startActivity(intent03)
        }
        }
    }
