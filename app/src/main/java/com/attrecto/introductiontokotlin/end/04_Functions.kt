package com.attrecto.introductiontokotlin.end

// Sima paraméter nélküli fv. Nem nagy meglepetés hogy ehhez sem kell class,
// Van visszatérési értéke: Unit (olyan mint a void), csak nem kell kiírni.
fun hello() {
    println("Helló")
}

// Meg lehet nem Unit visszatérési értéke is
fun returnsAFour(): Int {
    return 4
}

// Itt is működik a type inference, meg az egyszerűsítés
fun returnsASix() = 6

// A függvényeknek lehet paramétere is
fun hello(name: String) {
    println("Hello $name")
}

// Több paraméter is lehet, és persze ezt is lehet egyszerűsíteni
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y

// A függvényeknek lehet default paramétere, nem kell sok overload-olt fv.
fun sum3(x: Int, y: Int, z : Int = 0, w : Int = 0) = x + y + z


fun main() {
    hello()
    val four = returnsAFour()
    println("four = $four")
    val six = returnsASix()
    println("six = $six")

    hello("Balázs")

    // Named parameters, Lehet olyan is hogy csak 1-1 default-ot írok át.
    val result = sum3(1, 2, w = 4)
}