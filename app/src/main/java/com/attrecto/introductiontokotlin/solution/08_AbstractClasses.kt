package com.attrecto.introductiontokotlin.solution

// Alakítsd át az öröklődéses feladatot, hogy az "Animal" osztály és a say() absztrakt legyen
// Használt az előző feladat kódját, vagy rakd bele az osztályokat a main() fv-be különben
// osztály újra definilása miatt nem fordul

fun main() {
    abstract class Animal {
        abstract fun say()
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

    val f = Fox()
    f.say()
    val c = Cat()
    c.say()
}
