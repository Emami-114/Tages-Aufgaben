fun main() {
    mapList(readln(), readln())
    mapList2(readln(), readln())

}
fun mapList(username:String,password:String){
    var loginSusses = false
    val mapList = mutableMapOf(
        "Hassan" to "12345","Noah" to "6677554","Tarim" to "998877","Goper" to "554433")
    for ((name,pass) in mapList){
        if (name == username && pass == password) {
            loginSusses = true
        }
    }
    if (loginSusses){
        println("Sie Sind angemeldet")

    }else{
        println("deine username oder password ist Falsch!!!")

    }
}

fun mapList2(username: String,password: String){
    val mapList = mutableMapOf("Hasso" to "3456789","Hola" to "112233")
    val lsit = mapList.forEach { (name, pass) -> if (username == name && password == pass) {
        println("sie sind angemeldet")
    }else{
        println("ihre name ist falsch")
    }
    }
    return lsit
}