package week_3

fun main(){
    val num = readLine()!!.toInt()

    println("$num in 10 until 100 : ${num in 10 until 100}")
    println("$num !in 10 until 100 : ${num !in 10 until 100}")


}