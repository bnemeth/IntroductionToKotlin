package com.attrecto.introductiontokotlin.solution

// Készíts el egy "name" nevű string változót, aminek az értéke a saját neved.
// Hasonlóan az előző feladathoz készíts alkalmazást ami kiírja hogy Helló, és a saját nevedet de most csupa nagybetűvel.
// A következő érdekes függvények vannak: uppercase()
fun main() {
    val name = "Balázs"
    println("Helló ${(name.uppercase())}")
}