fun main(){
    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem Anhang .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.

    var laenge : Int
    println("bitte gebe eine lange ein?")
    laenge = readln().toInt()

    var breite : Int //TODO : Nimm eine Eingabe an, welche der Breite zugeordnet wird.
    println("bitte geb eine breite ein?")
    breite = readln().toInt()
    var flaeche : Int = laenge * breite  //TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Flaeche

    // bitte println wieder auskommentieren zum Testen
    println("$flaeche")
}