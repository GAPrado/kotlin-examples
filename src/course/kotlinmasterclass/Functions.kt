package course.kotlinmasterclass

fun functions() {
    functionsExample01()
    functionsExample02(10)
    functionsExample03()
    functionsExample04()
    functionsExample05()
    functionsExample06()
    functionsExample07()
}

fun functionsExample01() {
    println("hello!")
}

fun functionsExample02(number: Int) {
    val value = double(number)
    println("double of $number is $value")
}

fun functionsExample03() {
    sayHello("Name 1")
    sayHello(listOf("Name 1", "Name 2", "Name 3"))
    sayHello("Name 1", "Name 2", "Name 3")
}

fun functionsExample04() {
    loginWelcome()
    loginWelcome("gap")
}

fun functionsExample05() {
    halfPrint(1.0)
    halfPrint(2.0)
}

fun functionsExample06() {
    taxProduct("product 1", 10.0)
    taxProduct(mapOf(
            Pair("product 1", 10.0),
            Pair("product 2", 12.0),
            Pair("product 3", 15.0)
    ))
}

fun functionsExample07() {
    printAnimals("Leao", "Urso", "Cavalo")
}

fun double(number: Int): Int {
    return number * 2
}

fun sayHello(name: String) = println("hello $name!")

fun sayHello(vararg names: String) = names.forEach { name -> sayHello(name) }

fun sayHello(names: Collection<String>) = names.forEach { name -> sayHello(name) }

fun loginWelcome(username: String = "Guest") { // default value
    println("Hello $username")
}

fun half(number: Double) = number / 2 // return shorthand

fun halfPrint(number: Double) {
    val half = half(number)
    println("Half of $number is $half")
}

fun taxProduct(name: String, price: Double) = println("Product '$name' has price of '${price * 1.2}' after tax.")

fun taxProduct(products: Map<String, Double>) = products.forEach { (name, price) -> taxProduct(name, price)  }

fun printAnimals(vararg animals: String) {
    fun printAnimal(animal: String) = println("Hey $animal!")
    animals.forEach { animal -> printAnimal(animal) }
}