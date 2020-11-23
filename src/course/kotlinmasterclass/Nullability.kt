package course.kotlinmasterclass

fun nullability() {

    val nullableName: String? = "test" // Type?

    val length = nullableName?.length // ?.

    val lastIndex = length?.minus(1) // ?. arithmetic operators with nullable

    val name = nullableName ?: "" // ?: elvis

    var twoTimesLength = length!! * 2 // !! avoid check, it's not null

    println("$nullableName has label of $name and length of $length with last index being $lastIndex")

    //problemOne()
}

fun problemOne() {

    /*
    Read a number from the console and convert it to Double.

    Multiply it by 7, and convert the result into a string.

    Print the length of that string to the console.
    */

    val input = readLine()

    val v1 = input
        ?.toDouble()
        ?.times(7)
        ?.toString()

    val result = v1
        ?.length
        ?: 0 // ?: elvis

    println("the length of $v1 is: $result")
}