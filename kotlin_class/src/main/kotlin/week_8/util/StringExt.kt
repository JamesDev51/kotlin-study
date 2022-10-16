package week_8.util

fun String.truncate(maxLength: Int):String{
    return if(this.length<= maxLength) this else substring(maxLength)
}