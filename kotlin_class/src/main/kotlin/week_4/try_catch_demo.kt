package week_4

fun main(){
    val s = readLine()!!
    var num: Int
    try{
        num= parseIntNumberInBinary(s)
    }catch(e: NumberFormatException){
        num=-1
    }
    println("Number is $num")
}