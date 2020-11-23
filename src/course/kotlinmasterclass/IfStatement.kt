package course.kotlinmasterclass

fun ifStatement() {

    example01(10)
    example02(11)
    example03("Cat")
}

fun example01(value: Int) {
    if (isEven(value)) {
        println("number $value is even!")
    } else {
        println("number $value is odd!")
    }
}

fun example02(value: Int) {
    println("number $value is ${isEvenText(value)}!")
}

fun example03(animal: String) {

    val message = if (animal == "Dog") {
       "au au"
    } else if (animal == "Cat") {
        "miau"
    } else {
        "..."
    }

    println("The $animal says $message!")
}

fun isEven(value: Int): Boolean {
    return value % 2 == 0
}

fun isEvenText(value: Int) : String {
    return (if (isEven(value)) "Even"
    else "Odd")
}