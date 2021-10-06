package com.attrecto.introductiontokotlin.solution

// Írj egy függvényt, aminek egy Int és egy függvény paramétere ami egy Int-et vár
// és Int-et ad vissza. Hasonlóan mint a doIt példa volt a fv írja ki a paraméter fv visszatérési
// étékét
// Hívd meg ezt a fv-t úgy hogy a megadott szám négyzetét írja ki.


fun doIt(x : Int, op : (Int) -> Int){
    print(op(x))
}

fun main() {
    doIt(4, { x -> x * x})
}