package week_3

fun main(){
    val num = readLine()!!.toInt()

    println("$num in 10 downTo 1 : ${num in 10 downTo 1}")

    for(n in 10 downTo 1){
        println(n)
    }
    
}