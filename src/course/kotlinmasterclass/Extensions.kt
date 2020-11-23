package course.kotlinmasterclass

fun extensions() {
    extensionFunctionExamples()
    extensionPropertyExamples()
}

fun extensionFunctionExamples() {
    extensionFunctionExample01()
    extensionFunctionExample02()
    extensionFunctionExample03()
}

fun extensionFunctionExample01() {
    fun String.slim() = this.substring(1, length-1)
    val name = "test"
    println(name.slim())
}

fun extensionFunctionExample02() {
    fun List<*>.injected() = "hello"
    val test = listOf("a", "b")
    println(test.injected())
}

fun extensionFunctionExample03() {
    fun Extensible.Companion.static() = println("hey")
    Extensible.static()
}

fun extensionPropertyExamples() {
    extensionPropertyExample01()
    extensionPropertyExample02()
}

val String.betterLength: Int
    get() = 200

val Extensible.Companion.number: Int
    get() = 200


fun extensionPropertyExample01() {
    println("test".betterLength)
}

fun extensionPropertyExample02() {
    println(Extensible.number)
}

class Extensible {
    companion object {}
}