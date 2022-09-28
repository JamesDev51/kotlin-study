package week_4

fun main(){
    var num: Int

    try{
        num = readLine()!!.toInt()
    }catch(e: NumberFormatException){
        num=-1
    }
    println("Number is $num")
}