fun main() {
    val a: List<Double> = listOf(2.3, 5.4, 6.8)
    val b: Double = a.min()

    var warenName = mutableListOf("Schokoriegel", "Wassereis", "Zeitungen")
    var warenPreise = mutableListOf(1.29, 0.49, 1.99)
    println(warenName + warenPreise)
    print("Gebe eine waren: ")
    val abgabe = readln()
    val abgabe2 = warenName.indexOf(abgabe)
    val abgabe3 = warenPreise[abgabe2]
    println(abgabe3)

    print("Füge deine ware zu: ")
    val fügen = readln()
    val fügen1 = warenName.add(fügen)
    print("Gebe eine preise ein: ")
    val fügen2_2 = readln().toDouble()
    val fügem2 = warenPreise.add(fügen2_2)
    println(warenName)
    println(warenPreise)



}

