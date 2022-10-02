package week_6

fun isLetterString(s: String ?):Boolean{

    if(s==null)return false //null이 아님을 확정

    if(s.isEmpty()) return false
    for( ch in s){
        if(!ch.isLetter()) return false
    }
    return true
}

fun main(){
    println(isLetterString("abc"))
//    println(isLetterString(null))
}