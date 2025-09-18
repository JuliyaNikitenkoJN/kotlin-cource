package ru.stimmax.lessons.lesson05.homevork

fun main() {
val soundStartPercent: Double = 100.0
var coefAttenuationN: Double? = null
val coefAttenuationStandart: Double = 0.5
var resultIntensity: Double = soundStartPercent * (coefAttenuationN ?: coefAttenuationStandart)
        println(resultIntensity) }

Задача 2
Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется
страховка на груз, которая составляет 0,5% от его стоимости.
В случае, если стоимость не указана, то берётся стандартная стоимость в $50
Задача: Рассчитать полную стоимость доставки.

un main() {
    val soundStartPercent: Double = 100.0
    var coefAttenuationN: Double? = null
    val coefAttenuationStandart: Double = 0.5
    var resultIntensity: Double = soundStartPercent * (coefAttenuationN ?: coefAttenuationStandart)
    println(resultIntensity) }

Задача 3
Контекст: Вы проводите метеорологические измерения. Одним из важных
показателей является атмосферное давление, которое должно быть зафиксировано.
Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.


un main() {
    val soundStartPercent: Double = 100.0
    var coefAttenuationN: Double? = null
    val coefAttenuationStandart: Double = 0.5
    var resultIntensity: Double = soundStartPercent * (coefAttenuationN ?: coefAttenuationStandart)
    println(resultIntensity) }