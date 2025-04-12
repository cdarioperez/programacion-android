package com.example.myapplication

import android.renderscript.Sampler

fun main(){
    val numerosReales = listOf(1,2,3,4,5,6,7,8,9,10)
    bucleFor(numerosReales)
    bucleWhile()


    val pedro = Persona("Pedro", 23)
    val juan = Persona("Juan", 14)
    val mike= Persona("Mike", 20)

    pedro.saludar()
    juan.saludar()
    mike.saludar()

    val cuentaBancaria = CuentaBancaria(saldo = 1000.0)
    cuentaBancaria.verSaldo()
    cuentaBancaria.depositar(500.0)
    cuentaBancaria.verSaldo()

    val miAnimal = Animal()
    val miPerro= Perro()
    val miGato = Gato()

    miGato.sonido()
    miAnimal.sonido()
    miPerro.sonido()
    miAnimal.comer()
    miPerro.comer()



}


fun bucleFor(numeros: List<Int>){
    for (numero in numeros){
        if (numero % 2 != 0) {
        println(numero)
    } else {
        break
        }
}}

fun bucleWhile() {
    var contador = 3
    while (contador >= 0){
        println("cuenta atras: $contador")
        contador--
    }

}

class Persona(val nombre: String, var edad: Int){
    init {
        println("${this.nombre} ha sido registrado con ${this.edad} anhos")
    }
    fun saludar(){
        println("Hola, me llamo ${this.nombre} y tengo ${this.edad} anhos")
    }
}

class CuentaBancaria( var saldo: Double) {
    fun depositar(monto: Double) {
        saldo += monto
    }
    fun verSaldo() = println("El saldo actual es: $saldo")
}

//class CuentaPremium (saldo: Double) : CuentaPremium(saldo) {
    //fun aplicarIntereses(tasa: Double) {
      //  saldo += saldo * tasa
    //}
//}

open class Animal {
    open fun sonido() {
        println("El animal hace un sonido")
    }
    open fun comer() {
        println("El animal come")
    }
}

class Perro: Animal() {
    override fun sonido() {
    println("El perro ladra")
    }

    override fun comer() {
        println("El perro come croquetas")
    }
}

class Gato: Animal() {
    override fun sonido() {
        println("El gato maulla")
    }
}