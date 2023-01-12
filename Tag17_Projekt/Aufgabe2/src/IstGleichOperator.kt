fun main() {
    isIntegerEqual(5, 5)
    isIntegerEqual(5, 10)
    isStringEqual("Hallo", "Welt")
    isStringEqual("Welt", "Welt")
}

fun isIntegerEqual(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    if (number1 == number2){
        println("Die zahlen sind gleich: $number1 == $number2")
    }else{
        println("Die zahlen sind nicht gleich: $number1 != $number2")
    }

}

fun isStringEqual(string1: String, string2: String) {
    // Schreibe hier deinen Code.
    if (string1 == string2) {
        println("Die String sind Gleich: $string1 == $string2")
    }else{
        println("Die String sind nicht Gleich: $string1 == $string2")
    }

}