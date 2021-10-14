package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vehiculo:Vehiculo= Vehiculo("Nissan", "Nissan Frontier","Negro")
        vehiculo.Informacion()
        vehiculo.encender()
        vehiculo.apagar()

    }


}