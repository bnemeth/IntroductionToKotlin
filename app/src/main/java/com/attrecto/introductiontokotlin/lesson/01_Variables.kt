package com.attrecto.introductiontokotlin.lesson

fun main() {
    // Változó készítés, nincs kezdeti értéke, de van típusa
    var streetNumber: Int

    // Amíg nem adunk neki értéket, addig nem tudjuk használni

    // Változó készítés kezdő értékkel
    // Type inference: kitalálja mi lehet a típusa. Még egyszerűbben írhatjuk: var streetName = "Wesselényi"
    var streetName: String = "Wesselényi"

    // Úgy tűnhet, hogy dinamikus típusa van egy változónak, de nem. Ami egyszer int, az nem lehet más.
    // streetNumber = "alma"

    // Amit kifejezetten szeretünk, a nem változtatható változó. Mindig ugyanez, sok gond nem lehet vele.
    // Java-ban nem volt ilyen. Idővel hozzászokik az ember és nagyon örül amikor valami nem változik.
    // Az IDE is szól ha
    val zip = "9024"
    // zip = "9025"
    streetName = "Wesselényi utca"

    // Nagyon sok típus van: Int, Long, String. Mindegyik objektum (nem primitív típus)
    // Ennek most akkor mi a típusa?
    val myLong = 10
    val myReallyLong = 10L

    // Nincs automatikus típus átalakítás, de vannak átalakító függvények
    val myLongAgain: Long = myLong.toLong()

    // Karakter és string
    val myChar = 'C'
    val myString = "C"

    // String interpolation
    val years = 10
    val message = "A decade is $years"

    // Sőt lehet bonyolultabb kifejezéseket is kiértékeltetni
    val name = "Balázs"
    val nameMessage = "Length of $name is ${name.length}"
}
