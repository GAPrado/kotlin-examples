package course.kotlinmasterclass


fun mapAndHashMap() {

    val login = mapOf(
        Pair("gap", "gapPass"),
        Pair("gap2", "gap2Pass")
    ) // immutable
    println(login)

    val user = "gap"
    println("password for user '$user' are ${login[user]}.")

    val emptyLogin = mapOf<String, String>()
    println(emptyLogin)

    val mutableLogin = hashMapOf(
        Pair("gap", "gapPass"),
        Pair("gap2", "gap2Pass")
    ) // mutable
    mutableLogin["gap3"] = "gap3Pass"
    println(mutableLogin)

    exercise01()
}

fun exercise01() {

    /*
    You manage an amusement park, and you have a map that stores dates and attendance.

    var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))

    Add a value for 26 Sept.

    How many people attended in total on 25 and 26 Sept?

    Is data for 22 Sept available?
    */

    val attendance = hashMapOf(
        Pair("23 Sept", 2837),
        Pair("24 Sept", 3726),
        Pair("25 Sept", 6253)
    )

    attendance["26 Sept"] = 2000

    val attendedTotal = attendanceDefault(attendance["25 Sept"]) + attendanceDefault(attendance["26 Sept"])

    println("Attendance for days 25 and 26 are $attendedTotal")

    val checkAvailableDate = "22 Sept"
    println("Date $checkAvailableDate are available: ${!attendance.containsKey(checkAvailableDate)}")
}

fun attendanceDefault(value: Int?) : Int {
    return value ?: 0
}
