import kotlin.random.Random.Default.nextInt

fun main() {
    while (true) {

        val spieler1 = (1..7).random()
        println("Spieler1 zahl: $spieler1")
        val spieler2 = (1..7).random()
        println("Spieler2 zahl: $spieler2")
        when {
            spieler1 > spieler2 -> println("Spieler 1 gewinnt Zahl ist: $spieler1")
            spieler2 > spieler1 -> println("Spieler 2 gewinnt Zahl ist: $spieler2")
            else -> println("Unentschieden, versuche noch mal")


        }
        println("Möchtest du nochmal wurfen: 'ja' oder 'nein'")
        val input = readln()
        if (input != "ja"){
            break
        }

    }

}