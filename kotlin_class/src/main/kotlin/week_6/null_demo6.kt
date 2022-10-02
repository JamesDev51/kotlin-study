package week_6

class Name(val firstName:String, val familyName: String)

class Person(val name: Name?){
    fun describe(): String{
        val currentName = name ?: return "Unknown" //null인경우는 unknown
        return "${currentName.firstName} ${currentName.familyName}"
    }
}

fun main(){

    val p = Person(null)
    println(p.describe())

    val p2=Person(Name("Charlie","Kim"))
    println(p2.describe())
}