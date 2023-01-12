fun main() {
    val duration: Int = 3
    if (duration < 1){
        println("Keine Prämie")
    }
    if (duration >= 1){
        println("5€ Amazon-Gutschein")
    }
    if (duration >= 2){
        println("15€ Amazon Gutschein")
    }
    if (duration >= 3){
        println("25€ Amazon Gutschein")
    }
    if (duration >= 4){
        println("50€ Amazon Gutschein")
    }
}