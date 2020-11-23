package course.kotlinmasterclass

import kotlin.random.Random

fun userInput() {
    //readAndPrintlnLine()
    //readAndPrintlnInt()
    //randomAndPrintlnInt()
}

fun readAndPrintlnLine() {
    val input = readLine()
    println(input)
}

fun readAndPrintlnInt() {
    val input = readLine() ?: ""
    println(input.toInt())
}

fun randomAndPrintlnInt() {
    val r = Random.nextInt()
    println(r)
}