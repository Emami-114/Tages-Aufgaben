fun main() {
    val personHau: MutableMap<String,String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katze",
        "Luis" to "Möuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau")
  personHau["Berta"] = "Esel"
  personHau["Eulen"] = "Pferde"
  personHau["Katzen"] = "Spechte"
    println(personHau)

    val zahl: MutableMap<Int,Double> = mutableMapOf(1 to 2.5,2 to 5.0,3 to 7.5,4 to 10.0)
}