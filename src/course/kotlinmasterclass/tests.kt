package course.kotlinmasterclass

import java.util.*

fun tests() {

    listOf("a", "b").forEach{ s -> println(s) }
    listOf("a", "b").forEach(::println)
}
