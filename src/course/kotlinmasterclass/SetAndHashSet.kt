package course.kotlinmasterclass

fun setAndHashSet() {

    val numbers = setOf(1, 2, 3, 3) // immutable
    println(numbers)

    val emptySet = setOf<Int>()
    println(emptySet)

    val mutableNumbers = hashSetOf(1, 2, 3, 3) // mutable
    println(mutableNumbers)
}