fun main() {
    // Addiere das Alter deiner Eltern und subtrahiere das Alter von dir und deinen Geschwistern von der Summe.
    // Lege das Alter der Personen jeweils als Variable an. Gib das Ergebnis mit dem println()-Befehl aus.
    val papa: Int = 45
    val mam: Int = 40
    val meine: Int = 27
    val schwester: Int = 20
    val sumEltern: Int = papa + mam
    val sumGeschwister:Int=meine + schwester
    println("Meine Eltern sind gesamt: $sumEltern  summe von geschweste $sumGeschwister Geschwister ${sumEltern - sumGeschwister}")


    println(eltern(papa,mam,meine,schwester))
}

fun eltern(papa:Int,mam:Int,schwester:Int,meine:Int):Int{
    return (papa + mam) - (schwester + meine)

}
