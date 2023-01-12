import kotlin.math.*

//TODO : Gegeben ist eine Liste von Quadratzahlen. Schreibe eine Funktion, welche diese Liste entgegennimmt und intern von allen Elementen der Liste die Wurzel zieht.
//TODO : Das Ergebnis wird in einer Liste zurückgegeben.
// Tipp: Benutzt hierfür die .map Funktion, welche ein Prädikat entgegennimmt und dieses auf alle elemente der Liste ausführt. Schaut euch hierfür auch noch mal das Beispiel in den Vorlesungsunterlagen an.
fun main() {
    var listeAusQuadratzahlen: List<Double> = listOf(1.0, 4.0, 9.0, 16.0, 25.0, 36.0, 49.0, 64.0, 81.0, 100.0)

    wurzel(listeAusQuadratzahlen).forEach { println(" -> $it") }

}

fun wurzel(list: List<Double>): List<Double> {
    val wurz = list.map { sqrt(it) }
    return wurz
}

