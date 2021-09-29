package com.attrecto.introductiontokotlin.end

// Sokszor van, amikor ez osztályt igazából adatok tárolására használunk csak.


data class User(val id : Int)

class RegularClassUser(val id : Int)

fun main() {
    val u1 = User(1)
    val u2 = User(1)
    println(u1 == u2)

    val rcu1 = RegularClassUser(1)
    val rcu2 = RegularClassUser(1)
    println(rcu1 == rcu2)

    println(u1)
    println(rcu1)

    val u3 = u1.copy(id=3)
    println(u3)

}