package week_8

class Person(val firstName: String, val lastName: String){
    companion object
}

val Person.Companion.UNKNOWN by lazy{ Person("John","Doe") }

fun main(){
    val p = Person.UNKNOWN

    println(p.firstName)

}