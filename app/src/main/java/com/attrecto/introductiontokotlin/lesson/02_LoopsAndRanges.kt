package com.attrecto.introductiontokotlin.lesson

fun main() {
    // Egyszerű for loop, kitalálja a típust,
    for (a in 1..100)
        println(a)

    // Ez igazából egy bejárható IntRange osztály
    val numbers: IntRange = 1..100
    for (a in numbers)
        println(a)

    // Visszafelé is van ilyen, csak nem csinál semmit mert ez üres halmaz
    for (a in 100..1)
        println(a)

    // Helyette van downTo
    for (a in 100 downTo 1)
        println(a)

    // Listákat is hasonlóan tudjuk bejárni
    val cities = listOf("Győr", "Budapest", "Tótkomlós")
    for (a in cities)
        println(a)

    // De talán jobban olvasható, ez itt egyébként egy érdekes dolog: függvény, vagy nyelvi elem?
    cities.forEach {
        println(it)
    }

    // Elöltesztelős ciklus
    var i = 100
    while (i > 0) {
        println(i)
        i--
    }

    // Hátultesztelős ciklus
    do {
        i++
        println(i)
    } while (i < 100)
}
