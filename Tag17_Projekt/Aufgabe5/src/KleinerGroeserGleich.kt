fun main() {
    println(mutableListOf(zahlgleich(2, 5), zahlgleich(5, 5), zahlgleich(6, 5)))
    println(mutableListOf(zahlgleich2(7,5),zahlgleich2(5,5),zahlgleich2(2,5)) )
}


fun zahlgleich(number1: Int, number2: Int): Boolean {
    return number1 <= number2
}

fun zahlgleich2(number1: Int, number2: Int): Boolean {
    return number1 >= number2
}