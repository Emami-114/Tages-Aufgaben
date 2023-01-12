fun main() {
    var doorsAreClosed = false
    var isMotorRunning = true
    if (isMotorRunning && doorsAreClosed){
        start()
    }else if (isMotorRunning){
       closeDoors()
    }
}

// Die Funktionen start() und closeDoors() sind vorgegeben.
fun start() {
    println("Software gestartet.")
}

fun closeDoors() {
    println("Bitte alle Türen schließen.")
}
