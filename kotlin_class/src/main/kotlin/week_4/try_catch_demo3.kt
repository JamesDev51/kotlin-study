package week_4

fun main(){
    
    //try-catch문 식으로 표현
    val num=try{
        readLine()!!.toInt()
    }catch(e: NumberFormatException){
        -1
    }
    println("Number is $num")
}