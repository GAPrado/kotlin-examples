package course.kotlinmasterclass

const val TEST = "abc";

fun variablesAndString() {

    val hello = "Hello"
    var world = "world"
    world += '!'
    val space = ' '
    var answer = 40
    answer += 2

    print(hello)
    print(space)
    print(world)
    print(space)
    println(answer)

    printlnLength(hello)
    printlnDecapitalize(hello)
    printlnCapitalize(world)
    printlnTrim("" + space + space + space + hello + space + world)

    println("$hello $world")
    val template = "$hello $world";
    println(template)

    println("$hello $world ${answer + 0}")
    println(TEST)
}

fun printlnLength(input: String) {
    println(input.length)
}

fun printlnCapitalize(input: String) {
    println(input.capitalize())
}

fun printlnDecapitalize(input: String) {
    println(input.decapitalize())
}

fun printlnTrim(input: String) {
    println(input.trim())
}