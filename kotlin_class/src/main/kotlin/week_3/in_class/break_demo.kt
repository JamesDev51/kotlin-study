package week_3.in_class

import kotlin.random.Random

fun main(){
    val num = Random.nextInt(1,101)
    while(true){
        val guess=readLine()!!.toInt()

        if(guess>num)println("Too big")
        else if(guess<num) println("Too small")
        else break
    }
    println("Right! the number is $num")
}