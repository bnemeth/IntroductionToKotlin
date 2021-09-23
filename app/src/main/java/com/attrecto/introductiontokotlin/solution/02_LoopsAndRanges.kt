package com.attrecto.introductiontokotlin.solution

// Írj alkalmazást, ami kiszámolja két szám legnagyobb közös osztóját
// https://hu.wikipedia.org/wiki/Euklideszi_algoritmus

fun main() {
    var a = 12
    var b = 18

    while (b > 0) {
        val temp = b
        b = a%b
        a = temp
    }

    print(a)
}