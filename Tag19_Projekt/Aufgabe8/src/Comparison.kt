fun main() {
    val list = listOf("Molla","Noah","Sola")
    val list2 =  listOf("Molla","Solid","Sabura")
    namenVergleich(list,list2)
}

fun namenVergleich(nameList : List<String>,nameList2:List<String>){
    println("Gebe name ein: ")
    val input = readln()
    if (input in nameList || input in nameList2){
        if (input in nameList){
            println("$input ist verfügbar in List 1 ")

        }else{
            println("$input ist nicht verfügbae in List 1") }

    }
    if (input in nameList2){
        println("$input ist verfügbar in List 2 ")
    }else{
        println("$input ist nicht verfügbae in list 2") }

}

