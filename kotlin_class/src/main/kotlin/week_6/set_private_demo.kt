package week_6

import java.util.*

class Person5(name: String){
    var lastChanged: Date? =  null
        private set

    var name = name
        set(value){
            lastChanged=Date()
            field=value
        }
}

fun main(){
    val p = Person5("Gildong")

//    p.lastChanged= Date()

    p.name="Charlie"
    println(p.lastChanged)
}