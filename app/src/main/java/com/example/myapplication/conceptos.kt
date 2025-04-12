package com.example.myapplication

fun main() {
    // Este es un comentario de una línea.

    /*
    * Es es un comentario de varias líneas
    * */

    var num1: Int = 40;
    var num2: Int = 20;
    var num3: Int = 50

    var suma: Int = num1 + num2;
    var resta: Int = num1 - num2;
    var multiplicacion: Int = num1 * num2;
    var division: Double = num1.toDouble() / num2.toDouble();

    var string1: String = "El resultado ";
    var string2: String = "de la operacion es:"

    // ¿num1 es menor que num2?
    if (num1 < num2) {
        println("El numero $num1 es menor que $num2");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else if(num1 > num3) {
        println("El numero $num1 es mayor que $num3");
    } else {
        println("Es el numero de en medio.");
    }


    val diaDeLaSemana: String = "Lunes"

    when (diaDeLaSemana) {
        "Lunes" -> println("El dia de la semana es: Lunes")
        "Martes" -> println("El dia de la semana es: Martes")
        "Miercoles" -> println("El dia de la semana es: Miercoles");
        "Jueves" -> println("El dia de la semana es: Jueves")
        "Viernes" -> println("El dia de la semana es: Viernes")
        "Sabado" -> println("El dia de la semana es: Sabado")
        else -> println("El dia de la semana es: Domingo")
    }

    println(saludar(nombre = "Dario"))
    println(saludar(nombre = "Juan"))
    println(saludar(nombre = "Pedro"))
    println(suma(numA = 10, numB = 80))
    println(resta(numA = 10, numB = 5))

    val resultado = operar(numA = 10, numB = 5) {x,y -> x * y}
    println(resultado)

    val operacion = obtenerOperacion("suma")
    val resultado2 = operacion(10,5)
    println(resultado2)

    val cuadrado: (Int) ->  Int = {x -> x * 2}
    println(cuadrado(16))

// It ejemplos
    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)
    numeros.forEach{
        println(it * 2)
    }

    val duplicar: (Int) -> Int = {it * 2}
        println(duplicar(5))

    val texto = "dARIO"
    println(texto.reversa())

    val person = Person(nombre = "Pepe", edad = 40)
    person.saludar()

    val cesar = Person("Cesar",40)
    cesar.saludar()

    val numeros3 = listOf(1,2,3,4,5,6,7,8,9,10,11)
    println(numeros3.sumarElementos())

    val numerosPrimos = listOf(3,5,7)
    println(numerosPrimos.sumarElementos())

    val ejemplo = Ejemplo()
    ejemplo.saludar()

    val numeros4 = listOf(1,2,3,4,5,6,7,8,9,10,11)
    val cuadrados = numeros4.map { it * 100 }
    val pares = numeros4.filter { it % 2 == 0 }
    val impares = numeros4.filter { it % 2 != 0 }
    val sumaTotal = numeros4.reduce { acc, i -> acc + i }
    val numerosMutable = mutableListOf(1,2,3,4,5,6,7,8,9,10,11)


    println("Cuadrados: $cuadrados")
    println("Pares: $pares")
    println("Impares: $impares")
    println("Suma Total: $sumaTotal")
    println(numerosMutable)
    numerosMutable.add(12)
    println(numerosMutable)


}

fun tiposDeDatos(){
    /*
   * Tipos de datos
   */

    // Numericos
    val byteExample1: Byte = 127;
    val shortExample1: Short = -32768;
    var intExample1: Int = 214748364;
    val longExample1: Long = 2147483648;

    // Decimales
    val floatExample1: Float = 3.141592f;
    val doubleExample1: Double = 3.141592653589793;

    // Strings
    val charExample1: Char = 'a';
    val stringExample1: String = "Esto es una cadena de texto";

    //Boolean
    val verdadero: Boolean = true;
    val falso: Boolean = false;

    intExample1 = 2147483;
    //print(intExample1);

}
fun tiposDeOperadores(){

    /*
    * Tipos de operadores
    * - Aritmeticos (+,-,*,/,%)
    * - Lógicos (||,&&, !)
    * - Relacionales (<,>,=,===,<=,>=,!=)
    */

}
fun saludar(nombre:String): String {
    return ("Hola, $nombre, bienvenido a la clase de Programacion")
}
fun suma(numA:Int, numB:Int): Int {
    return numA + numB
}
fun resta(numA:Int, numB:Int): Int = numA - numB
fun operar(numA:Int, numB:Int, operacion:(Int,Int) -> Int): Int {
    return operacion(numA,numB)
}
fun obtenerOperacion(tipo:String): (Int,Int) -> Int {
    return when (tipo){
        "suma" -> {x,y -> x + y}
        "resta" -> {x,y -> x - y}
        "multiplicacion" -> {x,y -> x * y}
        "division" -> {x,y -> x / y}
        else -> {x,y -> 0}
    }
}
fun String.reversa(): String {
    return this.reversed()
}
fun Person.saludar(){
    println("Hola, me llamo $nombre y tengo $edad años.")
}
fun List<Int>.sumarElementos(): Int {
    return this.sum()
}

class Person (val nombre: String, val edad: Int)
class Ejemplo {
    public fun saludar() {
        println("Hola, soy un método publico")
    }
}

