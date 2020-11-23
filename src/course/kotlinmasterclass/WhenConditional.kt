package course.kotlinmasterclass

fun whenConditional() {
    whenConditionalExample01("dog")
    whenConditionalExample02(10)
    whenConditionalExample03("March")
    whenConditionalExample04("hello!")
}

fun whenConditionalExample01(animal: String) {

    val action = when (animal) { // when as expression
        "dog" -> "pet it"
        "cat" -> "feed id"
        else -> "do nothing"
    }

    println("this is a $animal, you should $action!")
}

fun whenConditionalExample02(number: Int) {

    var numberType: String? = null
    when (number % 2) { // when as expression
        0 -> numberType = "even"
        1 -> numberType = "Odd"
    }

    println("The number $number is $numberType")
}

fun whenConditionalExample03(month: String) {

    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }

    println("Month $month has $days days.")
}

fun whenConditionalExample04(password: String) {

    when (val length = password.length) {
        in 1..5 -> println("password of length $length are short")
        in 6..10 -> println("password of length $length are medium")
        else -> println("password of length $length are long")
    }
}
