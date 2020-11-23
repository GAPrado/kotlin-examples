package course.kotlinmasterclass

fun objectOrientedProgramming() {
    objectOrientedProgrammingExample01()
    objectOrientedProgrammingExample02()
    objectOrientedProgrammingExample03()
    objectOrientedProgrammingExample04()
    objectOrientedProgrammingExample05()
    objectOrientedProgrammingExample06()
    objectOrientedProgrammingExample07()
    objectOrientedProgrammingExample08()
    objectOrientedProgrammingExample09()
}

fun objectOrientedProgrammingExample01() {
    val car = Car("Peugeot 208")
    println("accelerating my ${car.model()} car:")
    car.accelerate()
}

fun objectOrientedProgrammingExample02() {
    println(DataBaseAccess.statusReport())
    DataBaseAccess.connect()
    println(DataBaseAccess.statusReport())
}

fun objectOrientedProgrammingExample03() {
    val dog = Dog()
    dog.name = "Miau"
    dog.bark()
    dog.eat()
}

fun objectOrientedProgrammingExample04() {
    val person = Person("Maria Rita", 27)
    println("Person '${person.name}' has age of '${person.age }'")
}

fun objectOrientedProgrammingExample05() {
    val book1 = Book("Dracula", "Bram Stoker")
    val book2 = Book("Mochileiro das Galaxias", "Douglas Adams")
    println(book1)
}

fun objectOrientedProgrammingExample06() {
    val smartPhone = SmartPhone()
    smartPhone.operationalSystem = "LG G7 ThinQ"
    println(smartPhone.operationalSystem)
}

fun objectOrientedProgrammingExample07() {
    println("Deck size = ${Deck.size()}")
    val deck = Deck(listOf(1, 2))
    println(deck)
}

fun objectOrientedProgrammingExample08() {
    val userRepository = UserRepository()
    userRepository.save()
}

fun objectOrientedProgrammingExample09() {
    val userApiClient = UserApiClient()
    userApiClient.requestResource()
    userApiClient.authenticated = true
    userApiClient.requestResource()
}

class Car(val model: String) {

    fun accelerate() {
        println("Vrummmmmmmmmmm!")
    }

    fun model(): String {
        return model
    }
}

object DataBaseAccess { // static / singleton

    var connected = false

    fun connect() {
        connected = true
    }

    fun disconnect() {
        connected = false
    }

    fun statusReport() = "DataBaseAccess connected status = $connected"
}

open class Animal {

    open var name: String = ""

    open fun eat() {
        println("eating!")
    }
}

class Dog: Animal() {

    fun bark() {
        println("$name barks!")
    }

    override fun eat() {
        super.eat()
        println("hummmmmmmmmm!")
    }
}

class Person(val name: String, val age: Int)

class Book {

    private val name: String

    private val author: String

    protected var test: String = ""

    internal var test2: String = "" // package private

    public var abc: String = "" // default

    constructor(name: String, author: String) {
        this.name = name
        this.author = author
        println("constructor")
    }

    init {
        println("init")
    }

    override fun toString(): String {
        return "Book(name='$name', author='$author')"
    }
}

class SmartPhone {

    var operationalSystem = ""
        get() {
            println("get called!")
            return field
        }
        set(operationalSystem) {
            println("set called!")
            field = operationalSystem
        }
}

class Deck(private val cards: Collection<Int>) {

    companion object  {

        private const val SIZE = 40

        fun size() = SIZE
    }
}

abstract class Repository {

    protected abstract fun entity(): String

    fun save() {
        println("saving ${entity()}")
    }
}

class UserRepository: Repository() {

    override fun entity() = "User"
}

interface ApiClient {

    var authenticated: Boolean

    fun isAuthenticated() = authenticated

    fun requestResource()
}

class UserApiClient: ApiClient {

    override var authenticated: Boolean = false

    override fun requestResource() {

        if (!authenticated) {
            println("requires auth!")
            return
        }

        println("Request Resource!")
    }
}

interface InterfaceOne {
    fun methodOne()
}

interface InterfaceTwo {
    fun methodTwo()
}

class Implementation: InterfaceOne, InterfaceTwo {

    override fun methodOne() {
        TODO("Not yet implemented")
    }

    override fun methodTwo() {
        TODO("Not yet implemented")
    }

}