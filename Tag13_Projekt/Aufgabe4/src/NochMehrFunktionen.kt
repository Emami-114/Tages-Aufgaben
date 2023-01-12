fun main() {
    println(stadtAdd(mutableListOf("Berlin","Hamburg","München")))

}
fun stadtAdd(stadt:MutableList<String>): String {
    return stadt.joinToString()
}