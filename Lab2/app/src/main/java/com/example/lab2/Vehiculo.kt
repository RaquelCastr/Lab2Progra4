package com.example.lab2

class Vehiculo (var Modelo:String, nombre:String, var Color:String):Marca(nombre),Acciones {

    fun Informacion(){
        println("Modelo: $Modelo")
        println("Marca: $nombre")
        println("Color: $Color")
    }

    override fun encender(){
        println("El Automovil esta encendido")
    }

    override fun apagar(){
        println("El Automovil esta apagado")
    }

    override fun Marca(){
        println("La Marca del carro es $nombre")
    }
}
