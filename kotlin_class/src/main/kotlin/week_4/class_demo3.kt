package week_4

class Person3(fullName: String){
    val firstName:  String
    val familyName: String
    init{
        val names = fullName.split(" ")
        if(names.size !=2) throw IllegalArgumentException("Invalid name : $fullName")
        firstName=names[0]
        familyName=names[1]
    }
}

fun main(){
    val person3=Person3("John Doe")

    println(person3.firstName)
    println(person3.familyName)
}