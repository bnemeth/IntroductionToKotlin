package com.attrecto.introductiontokotlin.lesson

import java.security.InvalidParameterException
import java.util.*

// Ez egy class, sok mindent nem tudsz vele csinálni, de az!
class Customer

fun customerInstance() {
    val c = Customer()
}

class Customer2 {
    var id = 12

    // És ugyanúgy lehet immutable is
    var name: String = ""
}

fun customer2Instance() {
    val c = Customer2()
    c.id = 4
    c.name = "Béla"
}

// Elég kényelmetlen mindig kezdeti értéket beállítani miután létrehoztuk, nem is kell,
// lehet konstruktor paramétereket használni.
class Customer3(initId: Int, initName: String) {
    val id = initId
    var name: String = initName
}

// És igazából tovább egyszerűsíthető így a konstruktor paraméterből property lesz.
class Customer4(val id: Int, var name: String)

// A property-k nek mint a fv-eknél lehet default érték.

// Mindenféle logikát rakhatunk az init blokkba

class Customer5(val id: Int, var name: String) {
    init {
        name = name.uppercase()
    }
}

// És lehet secondary konstruktorokat is létrehozni
class Customer6(val id: Int, var name: String) {
    constructor(id: Int, firstName: String, lastName: String) : this(id, "$firstName, $lastName") {
        // És ide jöhet ugyanaz mint az init blokk-nál
        name = name.uppercase()
    }
}

// OPCIONÁLIS TANANYAG!!

// Custom setter/getter

class Customer7(val id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialNumber: String = "0000"
        set(value) {
            if (value.isEmpty()) {
                throw InvalidParameterException()
            }

            field = value
        }

    // Illetve lehet metódusa is egy osztálynak
    fun customerAsString() = this.name
}

fun main() {
    // Nem kell new keyword
    val a = Customer2()
    a.id = 1
    a.name = "Balázs"

    val b = Customer5(12, "Balázs")
    print(b.name)
}
