package course.kotlinmasterclass

fun numbersAndVariables() {
    val value = sum(1, 2)
    println(value)
    println(value::class.java)

    val intValue = 1
    println(intValue::class.java)

    val longValue : Long = 1
    println(longValue::class.java)

    val longValueTwo = 1L
    println(longValueTwo::class.java)

    var doubleValue = 5.0
    println(doubleValue::class.java)

    var floatValue = 5.0F
    println(floatValue::class.java)

    println(3.toLong()::class.java)
}

fun sum(v1: Int, v2: Int) : Int {
    return v1 + v2
}