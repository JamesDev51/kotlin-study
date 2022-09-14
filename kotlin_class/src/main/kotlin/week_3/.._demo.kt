package week_3

fun main(){
    val num = readLine()!!.toInt()

    println("$num in 10 .. 99 : ${num in 10 .. 99}")
    println("$num !in 10 .. 99 : ${num !in 10 .. 99}")

    val str = readLine()!!
    println("$str in \"def\" .. \"xyz\" : ${str in "def " .. "xyz"}")
}