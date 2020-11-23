package course.kotlinmasterclass

fun forLoop() {
    forLoopExample01()
    forLoopExample02()
    forLoopExample03()
    forLoopExample04()
    forLoopExample05()
}

fun forLoopExample01() {
    for (i in 1..10) {
        println("i = $i")
    }
}

fun forLoopExample02() {
    val animals = listOf("Dog", "Cat", "Giraffe")
    for (animal in animals) {
        println("animal = $animal")
    }
}

fun forLoopExample03() {
    for (i in 10 downTo 0) {
        println("i = $i")
    }
}

fun forLoopExample04() {
    for (i in 10 downTo 0 step 3) {
        println("i = $i")
    }
}

fun forLoopExample05() {
    for (i in 0..10 step 2) {
        println("i = $i")
    }
}