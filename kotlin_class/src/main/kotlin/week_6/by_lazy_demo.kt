package week_6

import java.io.File

class Content2(var file: File){
     val text by lazy { // 초기화 시점을 호출 시점으로 미룸
         println("reading text from file")
         file.readText()
     }

}

fun main(){
    val c= Content2(File("Quiz.txt"))

    println("Before access text")
    println(c.text)
}