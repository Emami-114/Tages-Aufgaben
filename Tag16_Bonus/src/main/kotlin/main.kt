fun main(){
    logging()
}

fun logging() {

    val listUserName = mutableListOf(
        person("jack","1234"),
        person("Noah","543"),
        person("mostanse","332211"),
        person("Booll","665")
    )

    var loginSuccess = false
    while(!loginSuccess){

        val inputUserName = readln()
        val inputPassword = readln()
        var dataCheck = false

        for(p in listUserName){
            if((inputUserName == p.username) && (inputPassword == p.password)){
                dataCheck = true
            }
        }

        if (inputUserName.isNullOrBlank()) {
            println("Dass feld ist leer !!!")
        }else if(dataCheck){
            loginSuccess = true
            println("Sie sind Angemeldet")
        }else{
            println("UserName oder Passwort falsch ist !!!")
        }
    }
}

class person(val username:String, val password: String)