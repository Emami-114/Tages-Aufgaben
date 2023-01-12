fun main() {
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",

        )
    val market: Map<String, Double> = mapOf(
        "Shokolade" to 1.99,
        "Banane" to 0.29,
        "Yoghurt" to 0.49,
        "Müsli" to 2.99
    )
    val farbe = mapOf(12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün")
    println(farbe)
    println(market)
    println(personZuHaustier)
}