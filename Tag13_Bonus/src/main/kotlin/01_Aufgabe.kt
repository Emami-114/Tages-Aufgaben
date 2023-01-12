fun main() {
    fläche(10, 30)
    rechteck(10, 30)
    kreise(4)

}

fun fläche(lange: Int, breit: Int) {
    println("Flascheninhalt: ${lange * breit}")
    println("Quadrates: ${4 * lange}")
}

fun rechteck(lange: Int, breit: Int) {
    println("Flächeninhalt: ${lange * breit}")
    println("Rechtecks: ${(2 * lange) + (2 * breit)}")
}

fun kreise(r: Int) {
    val pi = 3.141592654
    println("Flächeninhalt ${(r*r)*pi}")
    println("Umfang: ${2 * r * pi}")
}

