package week_6

//private val prefix = "Hello, "
internal val prefix = "Hello, "

fun main(){
    val name = readLine() ?: return
    println("$prefix$name")

    test()
}