fun main() {
//    println(doppelterWert())
    film()
//nameMap()
}

fun doppelterWert(): Int {
    val zahl = 12
    return zahl * 3
}

fun film() {
    val filmList = listOf("Star Wars", "Shrek", "Toy Story")
    print("Gibe deine Name: ")
    val name = readln()!!.toString().split(",")
    println("Weillkommen $name")
    for ((index, filme) in filmList.withIndex()) {
        println("Unsere Film liste: $index -> $filme")
    }
    print("Gibe deine Gewünschte Index: ")
    val input = readln().toInt()
    val ergibniss = filmList[input]
    println(ergibniss)

}

fun nameMap(){
    val nameMap = mutableMapOf("Herbert" to 18,"Noah" to 25,"Moham" to 30)
    val inputName = readln()
    val inputAge = readln().toInt()
    nameMap[inputName] = inputAge
    nameMap.forEach { t, u -> println("Name ist: $t -> $u Alt ist!!") }
    val jungste = nameMap.minBy { it.value }
    val alteste = nameMap.maxBy { it.value }
    println("Der jungste: ${jungste}  \nDer Alteste: $alteste")

}