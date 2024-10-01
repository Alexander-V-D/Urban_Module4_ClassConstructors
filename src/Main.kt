fun main() {

    //Задача 1
    val box = Box(4.0, 5.0, 4.0)
    println("Ответ к задаче 1: ${box.getVolume()}\n")

    //Задача 2
    printMaxAndMinFromArray(arrayOf(1, 2, 3, 4, 5))

    //Задача 3
    println("Ответ к задаче 3:")
    arrayOf(3, 67, 1, 55, 65, 89, 23).forEach { println(it) }
    println()

    //Задача 4
    val a = 1
    print("Ответ к задаче 4: $a - ")
    when {
        a < 0 && a % 2 == 0 -> println("Отрицательное четное число")
        a < 0 && a % 2 == 1 -> println("Отрицательное нечетное число")
        a == 0 -> println("Нулевое число")
        a > 0 && a % 2 == 0 -> println("Положительное четное число")
        a > 0 && a % 2 == 1 -> println("Положительное нечетное число")
    }
    println()

    //Задача 5
    println("Ответ к задаче 5:")
    val car = Car(1500, 0)
    car.move(100)
    car.stop()
}

//Функция для задачи 2
fun printMaxAndMinFromArray(array: Array<Int>) {
    var min = array[0]
    var max = array[0]
    array.forEach { if (it < min) min = it}
    array.forEach { if (it > max) max = it}
    println("Ответ к задаче 2: \n" +
            "Минимальное значение: $min\n" +
            "Максимальное значение: $max\n")
}