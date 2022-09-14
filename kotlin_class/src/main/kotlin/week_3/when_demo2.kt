package week_3.in_class

fun numberDescription(n: Int): String = when{
    n==0-> "Zero"
    n==1 || n==2 || n==3 -> "Small"
    n in 4 ..9 -> "Medium"
    n in 10..100 -> "Large"
    n !in 0 .. Int.MAX_VALUE -> "Negative"
    else -> "Huge"
}
fun numberDescriptionSkip(n: Int): String = when(n){
    0-> "Zero"
    1, 2,3 -> "Small"
    in 4 ..9 -> "Medium"
    in 10..100 -> "Large"
    !in 0 .. Int.MAX_VALUE -> "Negative"
    else -> "Huge"
}

fun main(){
    val n =readLine()!!.toInt()

    println(numberDescription(n))


}