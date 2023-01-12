fun main() {

    // Beispiel Map.
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hund",
        "Alfred" to "Katze",
        "Tim" to "Maus",
    )

    // Hier holen wir uns das Set Schlüssel von der Map und konvertieren das Set anschließend zu einer Liste.
    val schluesselSet: Set<String> = personZuHaustier.keys
    val schluesselListe: List<String> = schluesselSet.toList()
    println(schluesselListe)
    // Wir können das auch in einer Zeile Abkürzen.
    val nochEineListe: List<String> = personZuHaustier.keys.toList()

    // Ebenso geht das auch mit MutableList.
    val wiederEineListe: MutableList<String> = personZuHaustier.keys.toMutableList()
    println(wiederEineListe)

    // Und neben den Schlüsseln können wir auch die Werte erhalten.
    val werteListe: List<String> = personZuHaustier.values.toList()
    println(werteListe)

    // todo: Schau dir die Listen in der Konsole an. Du kannst auch ruhig den bestehen Code ändern und experimentieren.

    val geschwindigkeit: MutableMap<String, Double> = mutableMapOf()

    geschwindigkeit.putAll(
        mapOf(
            "Auto" to 120.5,
            "Flugzeug" to 755.2,
            "Fahrrad" to 22.0,
            "Tretroller" to 15.7
        )
    )
    println(geschwindigkeit)

    val trueFalse: Map<Boolean,Int> = mapOf(false to 5, true to 7)
    println(trueFalse)
}