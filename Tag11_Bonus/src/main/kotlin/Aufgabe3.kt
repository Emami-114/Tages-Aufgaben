
fun main() {
rechner()
}

fun rechner() {
    var a = readln().toInt()
    var zeichen = readln()
    var b = readln().toInt()
    when(zeichen){
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> println(a / b)
        else -> println("eingabe nichr richtig ist!!!")
    }


}