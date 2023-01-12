fun main() {
    val geschwindigkeit: MutableMap<String, Double> = mutableMapOf()

    geschwindigkeit.putAll(
        mapOf(
            "Auto" to 120.5,
            "Flugzeug" to 755.2,
            "Fahrrad" to 22.0,
            "Tretroller" to 15.7
        )
    )
    val geschwindigkeitKey = geschwindigkeit.keys.toList()
    println(geschwindigkeitKey)
    println(geschwindigkeit)
    if (geschwindigkeit.contains("Flugzeug")){
        println("Flugzeug gibt'es in Liste")
    }
    println(geschwindigkeitKey.contains("Moped"))
    println(geschwindigkeitKey.contains("Tretroller"))

    val geschwindigkeitValue = geschwindigkeit.values.toList()
    println(geschwindigkeitValue.contains(755.2))
    println(geschwindigkeitValue.contains(2.0))
    println(geschwindigkeitValue.contains(120.5))
}