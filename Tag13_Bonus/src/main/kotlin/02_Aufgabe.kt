fun main() {
println("${kilometerToMeter(0.5).toInt()} -> Meter")
println("${meterToKilometer(500.0)} -> KiloMeter")
}

fun kilometerToMeter(kiloMeter: Double):Double{
    return kiloMeter * 1000
}
fun meterToKilometer(meter:Double):Double{
    return meter / 1000
}