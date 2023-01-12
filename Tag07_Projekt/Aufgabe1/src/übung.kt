fun main (){
//var essen = mutableListOf("Reis","Nudeln","Fleische")
//    essen.add("Tomaten")
//    essen.add("Fisch")
//    println(essen.first())
//    println(essen.last())
//    essen.remove("Reis")
//    println(essen)

    var filme = mutableListOf("Batman","Spider man","Iron Man")
    var bewerte = mutableListOf(4.5,4.9,5.0)
    println(filme[bewerte.indexOf(bewerte.min())])
//    var indexaller = bewerte.indexOf(bewerte.max())
//    var liebling = filme[indexaller]
//    println(liebling)

    var schneiden = filme.slice(0..1)
    var ergebnis = filme.contains("batman")
    filme.shuffle()
    filme.sort()
    var random = filme.random()
    println(random)
    println(filme)
    println(ergebnis)
}