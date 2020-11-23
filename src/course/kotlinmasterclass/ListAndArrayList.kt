package course.kotlinmasterclass

fun listAndArrayList() {

    val colors = listOf("red", "green", "blue") // List -> immutable
    println("first element are ${colors[0]}")
    println("second element are ${colors.get(1)}")
    println("$colors has a total of ${colors.size} elements.")

    val emptyColors = listOf<String>()
    println(emptyColors)

    val mutableCollors = arrayListOf("red", "green", "blue") // ArrayList -> mutable
    mutableCollors.remove("red")
    mutableCollors.add("yellow")
    println(mutableCollors)
}