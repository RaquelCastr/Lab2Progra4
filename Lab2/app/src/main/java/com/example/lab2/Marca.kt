package com.example.lab2

 open class Marca(var nombre:String) {

    private var marca = "NISSAN"
    protected open fun Marca(){
        println("La Marca del carro es $marca")
    }

}