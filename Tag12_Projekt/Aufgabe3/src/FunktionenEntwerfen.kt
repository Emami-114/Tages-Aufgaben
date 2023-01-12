fun main() {
    zuruckGabeWert()
    zuruckGabeWert2()
    hallo()
    halloList()
    mutableMap()
}

fun zuruckGabeWert(): Int {
    val nummer = 5
    println(nummer)
    return nummer
}

fun zuruckGabeWert2(): Double {
    val Double = 6.234
    println(Double)
    return Double
}

fun hallo() {
    println("Hallo")
}

fun halloList() {
    val list = listOf("Hallo", "Welt", "!")
    return println(list.joinToString())
}

fun mutableMap(): MutableMap<String, Boolean> {
    val mutableMap = mutableMapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )
    return mutableMap
}