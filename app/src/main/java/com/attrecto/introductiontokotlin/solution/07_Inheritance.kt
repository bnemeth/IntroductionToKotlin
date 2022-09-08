package com.attrecto.introductiontokotlin.solution

// Készíts egy "Animal" oasztályt aminek van egy "say" metódusa.
// Készíts "Fox" osztályt, ha a róka mondja azt hogy "Ring-ding-ding-ding-dingeringeding!"
// Készíts "Cat" osztályt, a kutya mondja azt hogy "Woof!" mert fáj a torka

// Hagyd hogy a diákok oldják meg a feladatot!

open class Animal {
    open fun say() {
    }
}

class Fox : Animal() {
    override fun say() {
        println("Ring-ding-ding-ding-dingeringeding!")
    }
}

class Cat : Animal() {
    override fun say() {
        println("Woof!")
    }
}

fun main() {
    val f = Fox()
    f.say()
    val c = Cat()
    c.say()
}
