fun main() {
    val personHaustiere: Map<String,String> = mapOf("Berta" to  "Hunde",
        "Frank" to "Katze",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau"
        )
    println("Lieblingtier von frank ist: ${personHaustiere.get("Frank")}")
    println("Lieblingtier von Sylvia ist: ${personHaustiere.get("Sylvia")}")
    println("Lieblingtier von Hans ist: ${personHaustiere.get("Hans")}")

    val nummerZuHause: Map<Int,String> = mapOf(12 to "Rot",
        45  to "Blau",
        23 to "Gelb",28 to "Grün",
        36 to "Lila",92 to "Rosa")
    println("Haus nummer 28 hat ${nummerZuHause.get(28)} Farbe.")
    println("Haus nummer 45 hat ${nummerZuHause.get(45)} Farbe.")
    println("Haus nummer 92 hat ${nummerZuHause.get(92)} Farbe.")
    println("Haus nummer 12 hat ${nummerZuHause.get(12)} Farbe.")
}