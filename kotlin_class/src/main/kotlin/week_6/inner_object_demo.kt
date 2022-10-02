package week_6

import java.lang.reflect.Array

class Application2 private constructor(val name:String){
    object Factory{
        fun create(args: kotlin.Array<String>): Application2?{
            val name = args.firstOrNull() ?: return null
            return Application2(name)
        }
    }
}
fun main(){
//    val a = Application2("My Application")

    val a =Application2.Factory.create(arrayOf("My Application"))
    val a2 =Application2.Factory.create(arrayOf())

    println(a)

}
