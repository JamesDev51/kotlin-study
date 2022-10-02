package week_6

fun describeNumber(n: Int ?)
= when{
    n==null -> "null"
    0<=n && n<=10 -> "small"
    n>10 && n<=100 -> "large"
    else -> "out of range"
}

fun isSingleChar(s: String?)
= s!=null && s.length==1

fun main(){
    println(describeNumber(null))

    println(isSingleChar("c"))
    println(isSingleChar(null))
}