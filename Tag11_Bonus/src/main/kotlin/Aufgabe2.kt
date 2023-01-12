
fun main(){
wurfel()
}
fun wurfel(){
    while (true){

    val wurfelZahl = setOf(1,2,3,4,5,6)
    val wurfRandom = wurfelZahl.random()
    println("Deine Wurfelzahl ist: $wurfRandom")
        print("Möchtest du noch mal Werfen? 'ja' oder 'nein': ")
        if (readln() != "ja"){
            break
        }
    }
}