package course.kotlinmasterclass

fun lambdaFunctions() {
    lambdaFunctionsExample01()
    lambdaFunctionsExample02()
    lambdaFunctionsExample03()
    lambdaFunctionsExample04()
    lambdaFunctionsExample05()
    lambdaFunctionsExample06()
}

fun lambdaFunctionsExample01() {
    { name: String -> println("hello, $name!") }("test")
}

fun lambdaFunctionsExample02() {
    val sayHello = { name: String -> println("hello, $name!") }
    sayHello("one")
    sayHello("two")
}

fun lambdaFunctionsExample03() {
    val v1 = 10;
    val v2 = 5;
    val plus = { a: Int, b: Int -> a + b }
    val minus = { a: Int, b: Int -> a - b }
    println("$v1 + $v2 = ${calculate(v1, v2, plus)}")
    println("$v1 - $v2 = ${calculate(v1, v2, minus)}")
}

fun lambdaFunctionsExample04() {
    val printMessage = { message: String -> println(message) }
    runMessage("test", printMessage)
    runMessage("teste irado meu", printMessage)
    runMessage("teste irado meu 2") { message: String -> println(message) }

}

fun lambdaFunctionsExample05() {
    fun highOrder(numbers: Collection<Int>, action: (Int) -> Int) {
        numbers.forEach { number -> println("number $number to ${action(number)}") }
    }
    highOrder(listOf(10, 20, 30, 40)) { number: Int -> number / 10 }
}

fun lambdaFunctionsExample06() {
    val clients = listOf("Client 1", "Client 2", "Client 3")
    clients.forEach { println(it) }
    clients.forEach { println("hello, $it!") }

    val sequence = listOf(1, 2, 3, 4, 5)
    sequence.filter { it < 3 }
            .forEach { println("filtered: $it") }

    val salary = listOf(1000.0, 1200.0, 1500.0)
    salary.map { it * 1.02 }
            .forEach { println("adjusted salary: $it") }

    val reversedSequence = listOf(1, 2, 3, 4, 5).reversed()
    val sortedSequence = reversedSequence.sortedBy { it }
    println(sortedSequence)

    val randomNumbers = listOf(10, 5, 100, 33, 77, 88, 27)
    val maxValue = randomNumbers.maxBy { it }
    val minValue = randomNumbers.minBy { it }
    println("$randomNumbers max is $maxValue and min is $minValue")
}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun runMessage(message: String, action: (String) -> Unit) = action(message)