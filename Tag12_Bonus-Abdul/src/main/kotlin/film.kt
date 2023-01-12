fun main() {
    val list = listOf("Hallo","Noah")

    var input = readln().toInt()
    when(input){
        in list.indices -> {
            println("Sie haben sich ${list[0]}")
        }
        else -> {
            println()
        }
    }

}

