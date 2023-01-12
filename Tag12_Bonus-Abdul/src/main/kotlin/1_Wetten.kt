
//fang hier drueber an zu coden
fun main() {
    print("HIERKOMMT DER EINSATZ: ")
val einsatz = readln().toDouble()

    println("HIER KOMMT DAS ERGEBNIS HIN: " + einsatz*quote())
}

fun quote(): Double {
    val listDouble = mutableListOf(0.0, 0.5, 0.0, 0.0, 0.25, 0.0, 2.0, 1.5, 1.5, 3.0)
    return listDouble.random()
}