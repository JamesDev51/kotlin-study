package week_12

fun main() {
    val array = arrayOf(1 to "one", 2 to "two", 3 to "three")

    for((number, name) in array){
        println("$number -> $name")
    }
}