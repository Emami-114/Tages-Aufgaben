fun main() {
    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch")
    // todo: Erweitere ab hier den Code.
//    wochentage.add("Donnerstag,Freitag,Samstag,Sonntag")
    val wochen: MutableList<String> = mutableListOf("Donnerstag","Freitag","Samstag","Sonntag")
    wochentage.addAll(wochen)
//    wochentage.add("Freitag")
//    wochentage.add("Samstag")
//    wochentage.add("Sonntag")
    println(wochentage)
    println(wochentage.size)
    wochentage.clear()
    println(wochentage)
//    []
}