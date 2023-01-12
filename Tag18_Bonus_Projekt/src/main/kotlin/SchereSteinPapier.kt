////////////////////////////////////////////////////////////
// BONUSAUFGABE: SCHERE, STEIN, PAPIER                 /////
////////////////////////////////////////////////////////////
// Heute wollen wir das bekannte Spiel implementieren. /////
// Dabei soll es nur einen Zug machen.                 /////
////////////////////////////////////////////////////////////

val SCHERE = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)

(SCHERE)
"""

val STEIN = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)

(STEIN)
"""

val PAPIER = """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)

(PAPIER)
"""

fun holeSpielerZug(): String {
    print("Bitte geben Sie Ihren Zug ein (Schere/Stein/Papier): ")
    // TODO: lese den Zug von der Konsole ein
    val spielerZug = readln()
    return spielerZug
}

fun holeComputerZug(): String {
    // TODO: hole zufälligen Zuf
    val computerZug = listOf("Schere", "Stein", "Papier").random()
    when (computerZug) {
        "Schere" -> {
            println(SCHERE)
        }

        "Stein" -> {
            println(STEIN)
        }

        "Papier" -> {
            println(PAPIER)
        }
    }

    return computerZug
}

fun printSpielzug(spielzug: String) {
    when (spielzug) {
        "Schere" -> {
            println(SCHERE)
        }

        "Stein" -> {
            println(STEIN)
        }

        "Papier" -> {
            println(PAPIER)
        }
    }
}

fun printErgebnis(computerZug: String, spielerZug: String) {
    if (computerZug == spielerZug) { /* TODO */
    } else if (computerZug == "Schere" && spielerZug == "Stein") {
        println("Stein schlägt Schere -> Spieler gewinnt ")
    } else if (computerZug == "Schere" && spielerZug == "Papier") {
        println("Schere schlägt Papier -> Computer gewinnt")
    } else if (computerZug == "Stein" && spielerZug == "Schere") {
        println("Stein schlägt Schere -> Computer gewinnt ")
    } else if (computerZug == "Stein" && spielerZug == "Papier") {
        println("Papier schlägt Stein -> Spieler gewinnt")
    } else if (computerZug == "Papier" && spielerZug == "Schere") {
        println("Schere schlägt Papier -> Spieler gewinnt")

    } else if (computerZug == "Papier" && spielerZug == "Stein") {
        println("Papier schlägt Stein -> Computer gewinnt")

    } else {
        println("Fehler!")
    }
}

fun main() {
    val spielerZug = holeSpielerZug()
    val computerZug = holeComputerZug()

    println("Der Computer spielt: ")
    printSpielzug(computerZug)

    println("-------- vs. --------")

    println("Dein Zug: ")
    printSpielzug(spielerZug)

    println("")
    printErgebnis(computerZug, spielerZug)
}