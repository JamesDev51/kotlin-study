package week_4

fun main(){
    val s = readLine()!!
    var num: Int
    try{
        num= parseIntNumberInBinary(s)
    }catch(e: NumberFormatException){
        num=-1
    }finally{
        println("항상 실행")
    }
    println("Number is $num")
}