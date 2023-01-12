fun main() {
println(zahRechner(123.45,76.55))
    println(zahlint(7,4))
    println(dreiZahl(25,40,100))
}
fun zahRechner(a:Double,b:Double): Double {
    return a + b

}

fun zahlint(a:Int,b:Int):Int{
    return a - b
}

fun dreiZahl(a:Int,b:Int,c:Int):Int{
    val multiple = a * b
    return multiple - c
}