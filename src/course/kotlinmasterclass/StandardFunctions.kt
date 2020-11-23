package course.kotlinmasterclass

/*
            let - common use: filter for non-null (it).
           with - common use: perform initialization, perform sequence of actions on a object (this).
            run - like with, but as extension. can return a result. can limit scope (this)
          apply - common use: applying configuration to an object creation (returns the original object) (this).
           also - common use: adding some actions that don't affect the object such as logging information (it).
         takeIf - returns the object if the predicate values to true. otherwise, returns null.
     takeUnless - returns the object if the predicate values to false. otherwise, returns null.
*/

fun standardFunctions() {
    letExamples()
    withExamples()
    runExamples()
    applyExamples()
    alsoExamples()
    takeIfExamples()
    takeUnlessExamples()
}

fun letExamples() {
    letExample01()
    letExample02()
    letExample03()
}

fun letExample01() {
    val person = PersonStandardFunctions("Guilherme", 30)
    person.let {
        it.name = "oldGuilherme"
        it.age += 1
    }
    println(person)
}

fun letExample02() {
    val person: PersonStandardFunctions? = null
    person?.let {
        it.name = "oldGuilherme"
        it.age + 1
    }
    println(person)
}

fun letExample03() {

    val animals = listOf("cat", "dog", "tiger", "lion")
    animals.map { it.length }
            .filter { it > 3 }
            .let(::println)
}

fun withExamples() {
    withExample01()
}

fun withExample01() {
    val person = PersonStandardFunctions("Guilherme", 30)
    with(person) {
        name = "OldGuilherme"
        age = 31
        println(this)
    }
}

fun runExamples() {
    runExample01()
    runExample02()
}

fun runExample01() {
    val person = PersonStandardFunctions("Guilherme", 30).run {
        name = "OldGuilherme"
        age = 31
        this
    }
    println("person: $person")
}

fun runExample02() {
    run {
        val person = PersonStandardFunctions("Guilherme", 30)
        person.name = "OldGuilherme"
        person.age = 31
        println("person: $person")
    }
}

fun applyExamples() {
    applyExample01()
}

fun applyExample01() {
    val person = PersonStandardFunctions("guilherme", 30).apply {
        name = "oldGuilherme"
        age += 1
    }
    println(person)
}

fun alsoExamples() {
    alsoExample01()
    alsoExample02()
}

fun alsoExample01() {
    val person = PersonStandardFunctions("guilherme", 30).apply {
        name = "oldGuilherme"
        age += 1
    }.also {
        println("look for $it")
    }
}

fun alsoExample02() {
    val person = PersonStandardFunctions("guilherme", 30).apply {
        name = "oldGuilherme"
        age += 1
    }.also(::println)
}

fun takeIfExamples() {
    takeIfExample01()
    takeIfExample02()
}

fun takeIfExample01() {
    val number = 1
    val evenOrNull = number.takeIf { number % 2 == 0 }
    evenOrNull?.let { println("number $it is even") }
}

fun takeIfExample02() {
    val number = 2
    val evenOrNull = number.takeIf { number % 2 == 0 }
    evenOrNull?.let { println("number $it is even") }
}

fun takeUnlessExamples() {
    takeUnlessExample01()
    takeUnlessExample02()
}

fun takeUnlessExample01() {
    val number = 1
    val oddOrNull = number.takeUnless { number % 2 == 0 }
    oddOrNull?.let { println("number $it is odd") }
}

fun takeUnlessExample02() {
    val number = 2
    val oddOrNull = number.takeUnless { number % 2 == 0 }
    oddOrNull?.let { println("number $it is odd") }
}

class PersonStandardFunctions(var name: String, var age: Int) {

    override fun toString(): String {
        return "PersonStandardFunctions(name='$name', age=$age)"
    }
}