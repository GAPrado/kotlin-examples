package course.kotlinmasterclass

fun generics() {
    genericExamples()
    typeConstraintExamples()
}

fun genericExamples() {
    genericExample01()
    genericExample02()
}

fun genericExample01() {
    val list: List<Int> = listOf(1, 2, 3)
    println(list)
}

fun genericExample02() {
    val box = Box("Test")
    println(box.get())
}

fun typeConstraintExamples() {
    typeConstraintExample01()
}

fun typeConstraintExample01() {

    fun <T, U: Container<T>>unbox(container: U) {
        println(container.get());
    }

    unbox(Box("test"));
    unbox(Box(1234));
}

class Box<T>(element: T): Container<T>(element)

abstract class Container<T>(private val element: T) {
    fun get() = element
}