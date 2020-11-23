package course.kotlinmasterclass

fun otherClasses() {
    dataClassExamples()
    enumClassExamples()
    sealedClassExamples()
    nestedClassExamples()
}

fun dataClassExamples() {
    dataClassExample01()
    dataClassExample02()
    dataClassExample03()
}

fun dataClassExample01() {
    User("Guilherme", "mail@mail.com", "password")
            .also(::println)
}

fun dataClassExample02() {
    val equals = User("Guilherme", "mail@mail.com", "password")
            .equals(User("Guilherme", "mail@mail.com", "password")) ||
            User("Guilherme", "mail@mail.com", "password") ==
            User("Guilherme", "mail@mail.com", "password")
    println("data class equals compares data? $equals")
}

fun dataClassExample03() {
    User("Guilherme", "mail@mail.com", "password")
            .copy(name = "test", email = "ops")
            .also(::println)
}

fun enumClassExamples() {
    enumClassExample01()
    enumClassExample02()
    enumClassExample03()
}

fun enumClassExample01() {
    when (RGB.BLUE) {
        RGB.RED -> println("RED")
        RGB.GREEN -> println("GREEN")
        RGB.BLUE -> println("BLUE")
    }
}

fun enumClassExample02() {
    val color = RGB.BLUE
    println("Color $color(${color.red}, ${color.green}, ${color.blue}) has name ${color.name} and ordinal ${color.ordinal}")
}

fun enumClassExample03() {
    RGB.getColor(0, 255, 0)
            .also(::println)
}

fun sealedClassExamples() {
    sealedClassExample01()
}

fun sealedClassExample01() {
    when(getPlant()) {
        is Fruit -> println("is a fruit.")
        is Vegetable -> println("is a vegetable.")
    }
}

fun nestedClassExamples() {
    nestedClassExample01()
}

fun nestedClassExample01() {
    val car = Car2()
    car.drive()
}

data class User(
        val name: String,
        val email: String,
        val password: String
)

enum class RGB(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    companion object {
        fun getColor(red: Int, green: Int, blue: Int) = values().first { red == it.red && green == it.green && blue == it.blue }
    }
}

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetable: Plant()

class Apple: Fruit()

class Potato: Vegetable()

fun getPlant(): Plant = Apple()

class Car2 {
    val maxSpeed = 100
    private val engine = Engine()

    fun drive() {
        engine.run()
        println("driving")
    }

    private inner class Engine {
        val maxRpm = 8000

        fun run()  {
            println("Engine running with max rpm of $maxRpm and max speed of $maxSpeed (${this@Car2.maxSpeed})")
        }
    }
}