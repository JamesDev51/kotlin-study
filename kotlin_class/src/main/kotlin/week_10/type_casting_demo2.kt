package week_10

fun main() {
    val o: Any = 123

    println(((o as? Long) ?: 0) + 1)

}