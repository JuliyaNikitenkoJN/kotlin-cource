package ru.stimmax.lessons.lesson05.homevork

fun main() {
    val soundStartPercent: Double = 100.0
    var coefAttenuationN: Double? = null
    val coefAttenuationStandart: Double = 0.5
    var resultIntensity: Double = soundStartPercent * (coefAttenuationN ?: coefAttenuationStandart)
    println(resultIntensity)

    var costDelivery: Double = 30.0
    var costOfCargo: Double? = null
    val costOfCargoStandart: Double = 50.0
    val insurancePercent: Double = 0.5
    var resultDelivery: Double = (costDelivery) + (((costOfCargo ?: costOfCargoStandart) / 100) * insurancePercent)
    println(resultDelivery)

    var atmosfericPressure: Double? = null
    var attentionMessage: String = "Attention, data of atmosferic pressure is lost "
    var resultAPressure = atmosfericPressure ?: attentionMessage
    println(resultAPressure)
}