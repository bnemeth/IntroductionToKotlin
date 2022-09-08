package com.attrecto.introductiontokotlin.lesson

// Minden nyelvben, ahol létezik "null" érték létezik a NullPointerException is.

// Nem tudom biztosan, de az egyik leggyakoribb hiba. Biztos mindenkivel előfordult már hogy olyan
// objektumra hivatkozott ami még nem létezik.

// Alapértelmezetten a Kotlin null safe!!

fun main() {
    var message: String = "A message"
    // Ez itt simán lefut, mert a message nem null.
    println(message.length)

    // Sőt, nem is tudunk null értéket adni a message-nek! Alapértelmezetten a
    // változók nem vehetnek fel null értéket. Viszont ha a változó típusánál pl String van, akkor
    // biztosak lehetünk benne hogy az sosem lehet null.
    // message = null

    // De persze van olyan hogy szükségünk van null-ra. Ilyenkor ezt a ? -el kell jelölni.
    var nullMessage: String? = null

    // De ilyenkor már nem fordul le a kódunk, mert a nullMessage null.
    // println(nullMessage.length)

    // Adhatunk nem null értéket neki, és akkor már lefordul. De láthatjuk hogy itt van valami
    // trükk. Az IDE be zöldezi a nullMessage-et, ami azt jelenti hogy bár a nullMessage vehet fel
    // null értéket, de itt a fordító ki tudja találni hogy ez most tuti nem null mert előtte egy
    // sorral adtunk neki nem null értéket.
    nullMessage = "Helló"
    println(nullMessage.length)

    // De nem mindig lehet kitalálni hogy null-e vagy nem ilyenkor szokott lenni hagyományosan a
    // null check. Ok, a kód nem olyan szép, de biztos nem felejtjük el mert e nélkül nem is
    // fordul.
    var nullMessage2: String? = null
    if (nullMessage2 != null) {
        println(nullMessage2.length)
    }

    // Safe operator, ha nem null, akkor végrehajtja, egyébként nem
    // Ez milyen szép!
    println(nullMessage2?.length) // null lesz amit print-el

    // Még szembetűnőbb a szépsége ha több osztályok keresztül van
    class Service {
        fun evaluate(): String? = null
    }

    class ServiceProvider {
        fun createService(): Service? {
            return null
        }
    }

    val serviceProvider = ServiceProvider()
    // Ezért ez sokkal szebb mint a sok if not null...
    println(serviceProvider.createService()?.evaluate()?.length)

    // Nagyon makacs fejlesztőknek: ha akarom akkor lábon lőhetem a kódot, és ez futás közben hal el
    println(nullMessage2!!.length)
}
