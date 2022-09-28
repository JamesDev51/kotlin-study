package week_4

fun parseIntNumberInBinary(s: String): Int{
    var num=0

    if(s.length !in 1..31) throw NumberFormatException("Not a Number: $s")

    for (c in s){
        if(c !in '0'..'1') throw NumberFormatException("Not a Number: $s")
        num=num*2+(c-'0')
    }
    return num
}

fun main(){
    val s = readLine()!!

    println("Int number: ${parseIntNumberInBinary(s)}")
}