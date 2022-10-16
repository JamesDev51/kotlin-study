package week_8

fun IntRange.Companion.singletonRange(n: Int)=n..n

fun main(){
    println(IntRange.singletonRange(3))
    println(IntRange.Companion.singletonRange(10))
}