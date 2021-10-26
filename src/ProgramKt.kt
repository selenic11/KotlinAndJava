fun main() {
    println("Hello, Kotlin!")
    val x = 5
    var y: Int =5
    var a = 13

    println(max(-3, 8))
    println(description(2.5))
}

fun description(something: Any) =
    when (something) {
        1, 5 -> "Int value"
        in 2..6 -> "Int in range 2..6"
        "Hello, Kotlin" -> "String with greeting"
        !is String -> "Not a String type"
        else -> "Something we don't know
    }

fun max(a: Int, b: Int) = if (a > b) a else b