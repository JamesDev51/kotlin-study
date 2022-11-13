package week_12

fun main() {
    val pair = Pair(1, "two")

    println(pair.first)
    println(pair.second)

    val triple = Triple(2,"two",false)
    println(triple.first)
    println(triple.second)
    println(!triple.third)

}