package course.kotlinmasterclass

fun expressions() {
    expressionExample01(10)
    expressionExample02("dog")
    expressionExample03(11)
}

fun expressionExample01(value: Int) {
    println("number $value is odd ?= ${isOdd(value)}")
}

fun expressionExample02(value: String) {
    val isPet = value in listOf("dog", "cat")
    println("animal $value is a pet ?= $isPet")
}

fun expressionExample03(value: Int) {
    println("number $value is between 1..10 ?= ${value in 1..10}") // not in = !in
}

fun isOdd(value: Int): Boolean {
    return value % 2 != 0
}