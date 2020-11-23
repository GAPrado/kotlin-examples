package course.kotlinmasterclass

fun breakAndContinue() {
    breakAndContinueExample01()
    breakAndContinueExample02()
    breakAndContinueExample03()
    breakAndContinueExample04()
}

fun breakAndContinueExample01() {
    for (i in 1..1000) {
        println("i = $i")
        if (i == 10) {
            break
        }
    }
}

fun breakAndContinueExample02() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println("i = $i")
    }
}

fun breakAndContinueExample03() {
    example@for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) {
                break@example
            }
            println("$i, $j")
        }
    }
}

fun breakAndContinueExample04() {
    example@ for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) {
                continue@example
            }
            println("$i, $j")
        }
    }
}