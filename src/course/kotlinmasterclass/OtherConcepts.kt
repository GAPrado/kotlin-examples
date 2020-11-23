package course.kotlinmasterclass

fun otherConcepts() {
    typeCastingExamples()
    lateInitExamples() // dependency injection, unit test
    lazyExamples()
}

fun typeCastingExamples() {
    typeCastingExample01()
    typeCastingExample02()
    typeCastingExample03()
    typeCastingExample04()
}

fun typeCastingExample01() {
    fun <T>isString(value : T) = value is String
    println(isString("abc"))
    println(isString(123))
}

fun typeCastingExample02() {
    fun <T>notIsString(value: T) = value !is String
    println(notIsString("abc"))
    println(notIsString(123))
}

fun typeCastingExample03() {
    fun <T: Button>checkButton(button: T) {
        button.execute()
        if (button is ToggleButton) {
            //button.getStatus() # is already checked, we can use directly
            (button as ToggleButton).getStatus() // example purpose only!
        }
    }
    checkButton(Button())
    checkButton(ToggleButton())
}

fun typeCastingExample04() {
    fun <T: Button>checkButton(button: T) {
        button.execute()
        (button as? ToggleButton)?.getStatus()
    }
    checkButton(Button())
    checkButton(ToggleButton())
}

fun lateInitExamples() {
    lateInitExample01()
}

fun lateInitExample01() {
    lateinit var test: String
    test = "abc" // isInitialized to tech
    println(test)
}

fun lazyExamples() {
    lazyExample01()
    lazyExample02()
}

fun lazyExample01() {

    fun lazyMethod(): String {
        println("lazyMethod called!")
        return "abc";
    }

    val lazyVariable: String by lazy { lazyMethod() }
    println("lazyMethod never called!")
}

fun lazyExample02() {

    fun lazyMethod(): String {
        println("lazyMethod called!")
        return "here";
    }

    val lazyVariable: String by lazy { lazyMethod() }
    println("basas")
    println(lazyVariable)
}

open class Button {
    fun execute() = println("running.")
}

class ToggleButton: Button() {
    fun getStatus() = println("active.")
}