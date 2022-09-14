package week_2

import java.util.*

fun main(){
    val str:String = "Hello"

    val text = "Hello World! \nThis is \" multiline\" string"
    println(text)

    println("\u03c0 \u2248 3.14")

    val name="minseok"
    println("Hello, $name! \nToday is ${Date()}")

    val message ="""
        Hello, $name!
        Today is ${Date()}
    """.trimIndent()


}
