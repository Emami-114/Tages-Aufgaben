fun main () {
    var unserErsterInteger : Int = 24
    var unserZweiterInteger : Int = 9
    var unserDritterInteger : Int = 5

    // TODO: Wir wollen nun unsere Integer dividieren.
    //  Jedoch verlieren wir etwas, wenn wir diese einfach so teilen, was ist es?
    //  Passe die folgenden Divisionen so an, dass wir dies nicht mehr verlieren.
    //
    //
    //

    var ersterDurchZweiter = unserErsterInteger.toDouble() / unserZweiterInteger.toDouble()
    var ersterDurchDritter = unserErsterInteger.toDouble() / unserDritterInteger.toDouble()
    var zweiterDurchDritter = unserZweiterInteger.toDouble() / unserDritterInteger.toDouble()

    // Hier zeigen wir die Ergebnisse auf der Konsole.
    println(ersterDurchZweiter)
    println(ersterDurchDritter)
    println(zweiterDurchDritter)

    /* TODO: Versuche vorauszusagen, was in den folgenden Variablen steht, ohne diese zu printen.
     *  Danach kannst du gerne dein Ergebnis mit einem print prüfen.
     * 
     *
     */
    var grosseZahl = (unserErsterInteger.toString() + unserZweiterInteger.toString()).toInt()
    var auchGrosseZahl = (unserZweiterInteger.toString() + unserDritterInteger.toString()).toInt()
    var nichtGanzSoGrosseZahl = grosseZahl + auchGrosseZahl.toDouble() / 2


}