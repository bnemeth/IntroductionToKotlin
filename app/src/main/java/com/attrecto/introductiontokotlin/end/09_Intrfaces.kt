package com.attrecto.introductiontokotlin.end

// Szintén vannak interface-ek is
interface CustomerRepository {
    // Ahol megadhatunk metódust
    fun getById(id: Int): Customer

    // És nagy meglepetésre adhatunk meg default implementációt is!! Ez máshol nem szokás,
    // pont erre vannak az absztrakt osztályok!
    fun store(customer: Customer) {
        print("store")
    }

    // Mi a különbség akkor?
    // Az interface-ek nem tárolhatnak állapotot (az absztrakt class igen) :
    //val i = 4
    // Egy osztály megvalósíthat több interface-et is, de nem öröklődhet több osztályból.

    // Bár nincs állapot, de lehet (absztrakt) property-t, és adhatunk meg neki pl getter-t!!
    // Ami talán kívülről ugyanaz mintha állapota lenne. (
    val isEmpty: Boolean
        get() = true
}

// Ez pedig egy megvalósítása az interface-nek
class SQLCustomerRepository : CustomerRepository {
    // Amiben kötelező kifejteni a default implementációval nem rendelkező metódusokat
    override fun getById(id: Int): Customer {
        return Customer()
    }

    // És akár felül lehet írni a default implementációval rendelkezőket is. De nem kötelező.
    override fun store(customer: Customer) {
        super.store(customer)
        print("Override")
    }
}