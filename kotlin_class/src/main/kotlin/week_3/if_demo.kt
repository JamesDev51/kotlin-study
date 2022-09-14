package week_3

fun max(a:Int, b:Int):Int{
    if (a>b) return a
    else return b
}
fun main(){
    val s =readLine()!!
    val i = s.indexOf("/")


    val result = if (i>=0){
        val a = s.substring(0,i).toInt()
        val b = s.substring(i+1).toInt()
        (a/b).toString()
    }else ""
    println(result)
}