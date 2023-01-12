fun main() {
    val temperatorZuTag: Map<Double, String> = mapOf(
        12.2 to "Montag",
        9.8 to "Dienstag",
        14.4 to "Mittwoch"
    )
//    println(temperatorZuTag)

    val woche: MutableMap<String,Boolean> = mutableMapOf(
        "Is heute Freitag?" to true,
        "War gestern Donnerstag?" to false,
        )
    woche.putAll(mapOf(
        "Is morgen Sonntag?" to false,
        "War gestern Donnerstag?" to true
        ))
//    println(woche)

    woche["War vorgester Montag?"] = false
    woche["Ist Übermorgen Dienstag?"] = false
//    println(woche)

    woche.remove("War gestern Mittwoch?", false)
    woche.remove("War gestern Donnerstag?", true)
    woche.remove("Ist Übermorgen Dienstag?", true)
//    println(woche)

    woche.remove("Ist Übermorgen Dienstag?")
//    println(woche)

  }