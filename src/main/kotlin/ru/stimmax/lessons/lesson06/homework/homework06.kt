package   ru.stimmax.lessons.lesson06.homework

fun main() {
    seasons(arg = 12)
    yearsDog(age = 1)
    travelMode(distanceKm = 3.8) //как написать проверку на отрицательное число?
    discount(points = 845)
    type(exn = ".jpeg")
    conversionTemperature(degreesValue = 38, degreesName = 'F')
    closes(temperature = 16, arg = true)
    cinema(age = 23)

    class homework06 {


    }
}
//Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца
// распечатывает сезон года.
// Номера месяцев начинаются с единицы.

fun seasons(arg: Int) {
    if (arg in 1..2) {
        println("winter")
    } else if (arg in 3..5) {
        println("spring")
    } else if (arg in 6..8) {
        println("summer")
    } else if (arg in 9..11) {
        println("autumn")
    } else if (arg == 12) {
        println("winter")
    } else {
        println("It is not the season of the year!")
    }
}
// Задание 2: "Расчет возраста питомца"
// Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам,
// после - каждый год равен 4 человеческим годам. Результат распечатай в консоль.

fun yearsDog(age: Int) {

    if (age in 1 until 2) {
        println("if dog has 1 year old -> in human age is 10.5 years old")
    } else if (age in 2 until 3) {
        println("if dog has 2 years old -> in human age is 21 years old")
    } else if (age in 3..27) {
        println("if dog has " + age + " years old is " + (21 + (age - 2)  * 4 ) +" human's years")
    } else {
        println("Dog dead..!")
    }
}

//Задание 3: "Определение способа перемещения"
//Напишите функцию, которая печатает в консоль, какой способ перемещения
// лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun travelMode(distanceKm: Double) {
    val mode = when {
        distanceKm in 0.0..1.0 -> println("to walk")
        distanceKm in 1.1..5.0 -> println("by bicycle")
        else -> println("by car")
    }
}

//Задание 4: "Расчет бонусных баллов"
//Клиенты интернет-магазина получают бонусные баллы за покупки.
// Напишите функцию, которая принимает сумму покупки и печатает
// в консоль количество бонусных баллов: 2 балла за каждые 100 рублей
// при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
fun discount(points: Int) {
    val bonusSelector: Int = 100
    when {
        points in 100..1000 -> println("You have " + (points / bonusSelector * 2) + " bonus balls")
        points > 1000 -> println("You have " + (points / bonusSelector * 3) + " bonus balls")
        else -> println("You dont have bonus balls")
    }

}

//Задание 5: "Определение типа документа"
//В системе хранения документов каждый файл имеет расширение.
// Напишите функцию, которая на основе расширения файла печатает в консоль его тип:
// "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun type(exn: String) {
    if (exn == ".txt" || exn == ".md" || exn == ".rtf" || exn == ".log" || exn == ".doc" || exn == ".docx" || exn == ".odt" || exn == ".pages" || exn == ".pdf" || exn == ".epub" || exn == ".djvu" || exn == ".html" || exn == ".xml" || exn == ".json" || exn == ".yaml") {
        println("This is a text")
    } else if (exn == ".jpg" || exn == ".jpeg" || exn == ".png" || exn == ".bmp" || exn == ".gif" || exn == ".tiff" || exn == ".heic" || exn == ".webp" || exn == ".svg" || exn == ".ai" || exn == ".eps" || exn == ".cdr" || exn == ".apng" || exn == ".psd" || exn == ".xcf" || exn == ".kra") {
        println("This is a picture")
    } else if (exn == ".xls" || exn == ".xlsx" || exn == ".xlsm" || exn == ".ods" || exn == ".numbers" || exn == ".csv" || exn == ".tsv" || exn == ".db" || exn == ".sqlite" || exn == ".mdb" || exn == ".accdb" || exn == ".dif" || exn == ".slk" || exn == ".dbf") {
        println("This is a table")
    } else {
        println("This extension is unknown! ")
    }
}
//Задание 6: "Конвертация температуры"
//Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты
// и наоборот в зависимости от указанной единицы измерения (C/F).
// Единицу измерения нужно передать вторым аргументом функции.
// Несколько аргументов передаются через запятую. Распечатай в консоль
// результат конвертации с добавлением единицы измерения.
// Чтобы добавить единицу измерения после результата используй
// функцию печати без переноса строки print("C") или print("F").

fun conversionTemperature(degreesValue: Int, degreesName: Char) {

    if (degreesName == 'F') {
        print(((degreesValue - 32) * 5 / 9)); println('C')
    } else if (degreesName == 'C') {
        print(((degreesValue * 9) / 5) + 32); println('F')
    } else println("Not a temperature!")
}


//Задание 7: "Подбор одежды по погоде"
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
// "куртка и шапка" при температуре ниже +10, "ветровка" от +10 до +18 градусов
// включительно и "футболка и шорты" при температуре выше +18 градусов.
// При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
fun closes(temperature: Int, arg: Boolean) {
    if (temperature < -30 || temperature > 35) {
        println("Stay at home!!!")
    } else if (temperature < 10) {
        println("Put on your jacket and hat")
    } else if (temperature in 10..18) {
        println("Put on a windbreaker")
    } else if  (temperature in 18 until 35) {  // mistake?
        println("Put on a T-shirt")}
    else println("Temperature is incorrect!")
}


//Задание 8: "Выбор фильма по возрасту"
//Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает
// доступные для него категории фильмов: "детские" (от 0 до 9),
// "подростковые" (от 10 до 18), "18+" для остальных.

fun cinema(age: Int) {
    val chooseMovie = when {
        age in 0..9 -> println("It is a movie for children")
        age in 10..18 -> println("It is a movie for teenagers")
        else -> println("18+")
    }

}


