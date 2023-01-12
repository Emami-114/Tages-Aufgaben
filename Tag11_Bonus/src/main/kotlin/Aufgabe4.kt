fun main() {
    print("deine Lebensmittel: ")
println(kuehlschrank(readln()))
}
fun kuehlschrank(lebensmittel: String ):Boolean {
    val list = listOf("Banane", "Orange", "Kartofel", "Äpfel")
    val contain = list.contains(lebensmittel)
    if (contain){
        println("$lebensmittel im Kühlschrank vorhanden!!!")
    }else println("$lebensmittel ist nicht im Kühlschrank vorhanden")
    return contain
}