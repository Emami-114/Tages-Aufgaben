////////////////////////////////////////////////////////////
// Bonusaufgabe: Message of the Day
////////////////////////////////////////////////////////////
// Wir wollen für unsere App eine Willkommensnachricht an
// den User schicken, eine sogenannte "Message of the day".
// Diese besteht aus Nutzernamen, Wetter und Stadt.
////////////////////////////////////////////////////////////


// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerNamen(): String {
    println("Geben Sie Ihren Benutzernamen ein: ")
    return readln()
    // TODO: lese über readln ein und returne den Nutzernamen
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerOrt(): String /* TODO */ {
    println("Geben Sie Ihren Wohnort ein: ")
    return readln()
    // TODO: lese über readln ein und returne den Wohnort
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeTemperatur(/* TODO */): Int /* TODO */ {
    var temperaturen = listOf(23, 24, 29, 21, 25, -10)
    return temperaturen.random()
    // TODO: returne zufällige Temperatur aus der Liste
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun printMessageOfTheDay(/* TODO */) /* TODO */ {

    // TODO: nutze die Funktionen hole...() um die Variablen zu initialisieren
    var name = holeNutzerNamen()
    var temperatur = holeTemperatur()
    var ort = holeNutzerOrt()

    var message = "Hallo $name! Es sind $temperatur Grad in $ort."

    println(message)
}

fun main() {
    printMessageOfTheDay()
}