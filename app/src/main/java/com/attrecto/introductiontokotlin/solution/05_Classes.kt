package com.attrecto.introductiontokotlin.solution

// Készíts egy "Dog" osztályt. A kutyának legyen neve, és tud "ugatni" ha meghívod a woof()
// metódusát

class Dog(val name: String) {
    fun woof() {
        println("[$name]: Woof!")
    }
}

fun main() {
    val d = Dog("Dorka")
    d.woof()
}
