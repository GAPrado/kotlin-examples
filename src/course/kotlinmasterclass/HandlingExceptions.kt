package course.kotlinmasterclass

import java.lang.Exception
import java.lang.IllegalArgumentException

fun handlingExceptions() {

    try {

        throw IllegalArgumentException("test")

    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("finish")
    }

    //val value = readInteger()
    //println("The value is: $value")
}

fun readInteger() : Int? {

    var value: Int? = null

    try {

        value = readLine()?.toInt()

    } catch (e: Exception) {
        e.printStackTrace()
    }

    return value
}