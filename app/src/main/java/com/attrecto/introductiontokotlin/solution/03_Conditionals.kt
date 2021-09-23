package com.attrecto.introductiontokotlin.solution

// Készíts alkalmazást, amiben van egy "num" nevű, int tipusú változót és egy elágazás.
// Az alkalmazás kimenete legyen az, hogy "Jajj de szép szám a (result)!" ahol
// a "result" mgegyezik "num" változóval ha "num" páros, egyébként hárommal több mint a "num"

fun main() {
    val num = 4

    // Egy nagyon tömör
    val result1 = if(num % 2 == 0) num else num + 3

    // Nem annyira tömör
    val result2 = if(num % 2 == 0){
        num
    } else {
        num + 3
    }

    // ha több eset lenne
    val result3 = when{
        num % 2 == 0 -> num
        else -> num + 3
    }

    print("Jajj de szép szám a $result1!")
}