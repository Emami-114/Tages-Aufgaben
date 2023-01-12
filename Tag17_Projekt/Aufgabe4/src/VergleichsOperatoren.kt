fun main() {
    compareNumbers(5, 2)
    compareNumbers(5, 7)
    compareNumbers(5, 5)
}

fun compareNumbers(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    if (number1 > number2){
        println("Die erste Zahl ist größer: $number1 > $number2")
    }else if (number1 == number2){
        println("Die zahl sind Gleich: $number1 == $number2")
    }else{
        println("Die erste zahl ist kleine: $number1 < $number2")
    }
}