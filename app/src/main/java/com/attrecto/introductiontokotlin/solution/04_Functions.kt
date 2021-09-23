package com.attrecto.introductiontokotlin.solution

// Írj függvényt, ami kiszámolja két szám legnagyobb közös osztóját
// https://hu.wikipedia.org/wiki/Euklideszi_algoritmus#Java_nyelv%C5%B1_p%C3%A9lda_rekurzi%C3%B3val

fun lnko(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    } else {
        return lnko(b, a % b)
    }
}

fun lnko2(a: Int, b: Int) = if (a % b == 0) b else lnko(b, a % b)

fun main() {
    val result = lnko2(12, 18)
    println(result)
}
