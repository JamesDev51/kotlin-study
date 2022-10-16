package week_8


fun String.truncate(maxLength: Int):String{
    return if(this.length<= maxLength) this else substring(maxLength)
}

fun main(){
    println("Hello".truncate(10))
    println("Hello".truncate(3))
}