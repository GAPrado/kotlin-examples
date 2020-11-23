package course.kotlinmasterclass

fun whileLoop() {
    whileLoopExample01()
    whileLoopExample02()
}

fun whileLoopExample01() {
    var i = 0
    while(i < 10) {
        println("i = $i")
        i++
    }
}

fun whileLoopExample02() {
    var i = 0
    do {
        println("i = $i")
        i++
    } while (i < 10)
}