package week_6

fun readInt(): Int?= readLine()?.toInt()
fun readInt2(): Int= readLine()?.toInt() ?: 0 //null이면 0이 됨

fun sayHello(name: String?){
    println("Hello ${name ?:  "Unknown"}")
}

fun main(){
//    val n:Int? =readLine()?.toInt() //null이면 null, 아니면 int

    sayHello("Charlie")
    sayHello(null)


}