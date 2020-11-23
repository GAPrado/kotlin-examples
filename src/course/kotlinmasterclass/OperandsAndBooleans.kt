package course.kotlinmasterclass

fun operandsAndBooleans() {
    println(1+1)
    println("te" + "st")

    val a: Short = 1
    val b: Int = 2
    val c = a * b
    println(c::class.java)

    val name = "Gap"
    val greetings = "Hello, $name!"
    println(greetings)

    println("1 + 1 = ${1 + 1}")


    val inputAmount = readLine()?:"0"
    val amount = inputAmount.toDouble()

    println("User amount of $amount is now ${amount * 3}")

    val n1 = 10
    val n2 = 20
    println("$n1 > $n2 = ${n1 > n2}")

}