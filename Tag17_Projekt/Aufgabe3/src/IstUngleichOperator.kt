fun main() {
    isDoubleUnequal(5.0, 10.0)
    isDoubleUnequal(10.0, 10.0)
    isBooleanUnequal(false, true)
    isBooleanUnequal(true, true)
}

fun isDoubleUnequal(number1: Double, number2: Double) {
    // Schreibe hier deinen Code.
    if (number1 != number2) {
        println("Zahlen sind nicht gleich. $number1 != $number2")
    }else{
        println("zahlen sind gleich: $number1 == $number2")
    }
}

fun isBooleanUnequal(boolean1: Boolean, boolean2: Boolean) {
    // Schreibe hier deinen Code.
    if (boolean1 != boolean2){
        println("Zahlen sind nicht gleich. $boolean1 != $boolean2" )
    }else{
        println("Zahlen sind gleich: $boolean1 == $boolean2")
    }

}