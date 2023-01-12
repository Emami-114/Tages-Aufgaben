fun tryLoggingIn(){
    var loginStatus = false
    val logins : Map<String,String>  = mapOf(
        "Mark" to "12345", "Simone" to "55555",
        "Sebastian" to "HalloIchBinSeb",
        "Tim" to "Passwort",
        "Marie" to "MarieIstDieBeste",
        "Nicole" to "NicPrincess1")
    // TODO : Schreibe hier deinen Code nach der Aufgabenstellung.
        println("---- Bitte Anmelden ----")
    print("Benutzer Name: ")
    val inputUserName = readln()
//    val inputIndex: String? = logins[inputUserName]
    print("Passwort: ")
    val inputPasswort = readln()
    if (logins.containsKey(inputUserName) && logins[inputUserName]== inputPasswort){
        loginStatus = true
        println("Sie Sind erfolgreich Angemeldet :)")
    }else
        loginStatus = false
        println("Benutzer name oder Passwort ist falsch!!!")

}



fun main(){
    //TODO : Funktionsaufruf
tryLoggingIn()
}