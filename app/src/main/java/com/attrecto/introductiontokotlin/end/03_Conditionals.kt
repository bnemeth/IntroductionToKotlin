package com.attrecto.introductiontokotlin.end

fun main() {
    var myString = "Not Empty"

    // Nagyon olyan mint amilyen szokott lenni egy if
    if(myString == ""){
        println("Empty")
    }else if (myString.startsWith("a")){
        println("Starts with 'a'")
    }else{
        println("Not empty")
    }

    // Kivéve az, hogy az if egy kifejezés is, van visszatérési értéke.
    // A visszatérési érték "Any", ami kb a java-s object
    val result = if(myString == ""){
        println("Empty")
        0
    }else{
        "Not empty"
    }
    print(result)

    // Érdekesség hogy nem használhatunk if-el else nélkül ha van visszarérési érték,
    // de ha nincs akkor igen
    /*val temp = */if(myString == ""){
        println("Empty")
    }

    // switch/case szerkezet
    when(result){
        is String -> println("It is a string")
        is Int -> println("It is an int")
    }

    // És szintén van visszatérése, és szintén kell else ág.
    val result2 = when(result){
        is String -> "It is a string"
        is Int -> "It is an int"
        else -> "Alma"
    }

    // Nem kötelező a when paramétere, és ilyenkor lehet bonyolultabb kifejezés is amiben esetleg
    // nem csak a "result" szerepel
    val result3 = when{
        result is String -> "It is a string"
        result is Int && result > 0 -> "It is an int"
        else -> "Alma"
    }

}