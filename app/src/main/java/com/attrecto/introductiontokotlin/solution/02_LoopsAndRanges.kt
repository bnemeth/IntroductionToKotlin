package com.attrecto.introductiontokotlin.solution

// Készíts alkalmazást, ami kiírja a páros számokat 0 és 100 között
// Hasznos operátor: a % maradékos osztás, vagy akár olyan range-et is létre lehet hozni ami
// párosával lépked: https://kotlinlang.org/docs/ranges.html#range

fun main() {
    for (i in 0 .. 100){
        if(i % 2 == 0){
            println(i)
        }
    }

    for(i in 0 .. 100 step 2){
        println(i)
    }
}