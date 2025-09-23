package ru.stimmax.lessons.lesson07.classwork_07

fun main() {

    for (i in 1 downTo 10 step 3) {
        if (i % 2 == 0) {
            println(i * i)
        }
    }

    val lenght: Int = 34
    for (i in 1 until lenght) {
        println(i)
    }

    var counter: Int = 0
    var sum: Int = 0 //накопитель числа
    while (counter < 10) { // если префиксный инкремент - то НЕ ПОПАДЕТ 10
        sum += counter
        counter++ // перенесли счетчик сюда, чтобы 10 включилось 10
        }

    var counter1: Int = 0
    var sum1: Int = 0
    do {
        counter1++
        sum1+=counter
        println(sum1)
    } while (sum1 + counter1 <= 50) // (sum <= 50)

    var counter2: Int = 1
    while (true) {
        println(counter2)
        if (counter2++ % 7 == 0) break
    }

    for (i in 1 .. 10) {
        if (i == 3 || i == 7) continue //булев оператор использовать только &&!!?
        println(i)                               //если проверяем на НЕРАВЕНСТВО ??
        }

        //каунтер увеличивается на 1, делаем континью и континью сопровождается сбросом счетчика, это в одном блоке кода

    var counterC: Int = 1
    for (i in 10 downTo 1) { //step 4 - выводить каждое четвертое число??
        counterC++
        if (counterC == 4) {
            counterC = 0
            continue
        }
        println(i)
    }


}