fun main() {
    val userAccept = true
    val passwordOk = false
    val connectSecure = true
    if (userAccept && passwordOk && connectSecure){
        println("Ok")
    }else if (userAccept){
        userAccepted()
        if (!passwordOk){
            println("False password." )
        }
        if (!connectSecure){
            println("Unsafe connection.")
        }
    }
    else if (passwordOk){
        passwordOk()
        if (!userAccept){
            println( "User denied.")
        }
        if (!connectSecure){
            println("Unsafe connection.")
        }
    }

    }

fun userAccepted() {
    println("der Nutzer erlaubt ist")
}

fun passwordOk() {
    println("das Password stimmt")
}

fun connectionSecure() {
    println("die Verbindung sicher ist")
}