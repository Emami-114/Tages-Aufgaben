 fun main() {
    val geschwin = mutableMapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7,
        )
    val sortSchlussel = geschwin.keys.toList().sorted().also { println(it) }
    val sortValue = geschwin.values.sorted().also { println(it) }
    val geschwinSum = sortValue.sum()/sortValue.size
    println(geschwinSum.toFloat())
}
