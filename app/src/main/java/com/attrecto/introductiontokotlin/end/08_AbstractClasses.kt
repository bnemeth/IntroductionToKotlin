package com.attrecto.introductiontokotlin.end

// Mint a java-ban, itt is vannak absztrakt osztályok, ezeket nem lehet példányostani
abstract class StoredEntity {
    // Az absztrakt osztálynak lehetnem nem absztrakt metódusai és property-jei
    var isActive = true

    fun status(): String {
        return isActive.toString()
    }

    // de lehet absztrakt metódusa (aminek nincs body-ja)
    abstract fun store()

    // vagy akár absztrakt property-je is.
    abstract val id: Int

}

class Employee(
    override val id: Int,
    val name: String
) : StoredEntity() {
    // A leszármazottakban, (ha nem absztrakt) akkor kötelező kifejteni az absztrakt osztály
    // absztrakt metódusait
    override fun store() {
    }

}


fun main() {
    // Az absztrakt osztály nem példányosítható
    //val storedEntity = StoredEntity()

    // Csak a belőle létrehozott osztály.
    val employee = Employee(1, "Gábor")

    // Kivételesen ide jön most a feladat ehhez a részhez.
    // Láttuk hogy nem lehet példányosítani a StoredEntity-t. Lehet valahogy mégis létrehozni
    // egy olyan változót ami StoredEntity?















    // Igen lehet. A változó típusa StoredEntity, az összes metódusát és property-jét el lehet érni
    // de nem lehet elérni az Employee name property-jét.
    val storedEntity : StoredEntity = Employee(1, "Gábor")
}

