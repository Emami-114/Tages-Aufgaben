fun main() {
val personHau: MutableMap<String,String> = mutableMapOf(
    "Berta" to "Hunde",
    "Frank" to "Katze",
    "Luis" to "Möuse",
    "Sylvia" to "Eulen",
    "Hans" to "Fau")
    personHau.putAll(mapOf(
        "Tim" to "Schildkröte",
        "Fabian" to "Papagei",
        "Jannik" to "Schlange"))

    val zahl: MutableMap<Int,Double> = mutableMapOf(1 to 2.5,2 to 5.0,3 to 7.5,4 to 10.0)
    zahl.putAll(mapOf(10 to 10.1,25 to 45.23,99 to 259.46))
    println(zahl)
    val contain = zahl.containsValue(5.0)
    println(contain)
}