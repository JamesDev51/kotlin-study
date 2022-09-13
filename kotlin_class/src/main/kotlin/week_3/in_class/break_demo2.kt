package week_3.in_class

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1,101)
    while(true){
        val guess=readLine()!!.toInt()

        val message= if(guess>num)"Too big"
        else if(guess<num) "Too small"
        else break
        println(message)
    }
    println("Right! the number is $num")
}