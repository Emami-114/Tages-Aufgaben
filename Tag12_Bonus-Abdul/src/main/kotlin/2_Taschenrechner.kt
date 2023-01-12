fun main() {
println(Math.round(rechner()))
}
fun rechner():Double{
    var a = readln().toDouble()
    var Zeichen = readln().toString()
    var b = readln().toDouble()
    var ergbnis:Double = 0.0

    when(Zeichen){
        "+" -> ergbnis= a+b
        "-" -> ergbnis= a-b
        "/" -> ergbnis= a/b
        "%" -> ergbnis= a%b
        "*" -> ergbnis= a*b
        else -> println("")
    }
    return ergbnis
}