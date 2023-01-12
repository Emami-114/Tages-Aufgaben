import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
println(dreiEck(4.2,6.5))
println(dreiEck(12.56,3.56))

}

fun dreiEck(a:Double,b:Double):Double{
    val c = a.pow(2) + b.pow(2)

    return sqrt(c)
}