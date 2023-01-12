//TODO : Schreibe deine Funktion hier...
fun korrektor(zungenbrecher:String){
    val ersetzt = zungenbrecher.replace(oldValue = readln(), newValue = readln())
    println(ersetzt)

}

fun main() {
    val zungenbrecher : String = "Aslronaulen kauten und kauten während sie blaugrüne Mondsteine klaubten."
    //TODO : Bereinige das erste Wort in dem String.
  korrektor(zungenbrecher)
}