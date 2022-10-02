package week_6

import java.io.File

class Content{
    lateinit var text: String

    fun loadFile(file: File){
        text = file.readText()
    }
}

fun main(){
    val c= Content()

    println(c.text) //UninitializedPropertyAccessException: lateinit property text has not been initialized
}