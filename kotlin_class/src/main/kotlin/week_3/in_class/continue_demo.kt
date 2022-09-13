package week_3.in_class

fun countLetters(text:String):IntArray{
    val counts= IntArray('z'-'a'+1)

    for(char in text){
        val charLower = char.lowercaseChar()
        if(charLower !in 'a' .. 'z') continue
        counts[charLower - 'a']++
    }
    return counts
}

fun main(){
    val text = readLine()!!
    val counts = countLetters(text)

    for (i in counts.indices){
        println("${'a'+i} : ${counts[i]}")
    }
}