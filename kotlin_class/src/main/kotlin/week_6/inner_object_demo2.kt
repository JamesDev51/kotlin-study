package week_6

import java.lang.reflect.Array

class Application3 private constructor(val name:String){
    companion object Factory{ //동반 객체 -> 대표 객체로 사용됨
        fun create(args: kotlin.Array<String>): Application3?{
            val name = args.firstOrNull() ?: return null
            return Application3(name)
        }
    }
}
fun main(){
//    val a = Application2("My Application")

    val a =Application3.create(arrayOf("My Application"))
    val a2 =Application3.create(arrayOf())

    println(a)

}
