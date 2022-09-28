package week_4

class Person8(val fullName: String){
    constructor(firstName: String, familyName:String):
            this("$firstName $familyName") //보조생성자에서 주 생성자를 호출
}

fun main(){

    val person: Person8 = Person8("John", "Doe")
    println(person.fullName)

    val person2: Person8 = Person8("John Doe")
    println(person2.fullName)


}