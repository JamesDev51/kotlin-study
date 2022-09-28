package week_4

class Person7{
    val fullName: String
    constructor(firstName: String, familyName:String):
            this("$firstName $familyName")
    constructor(fullName: String) {
        this.fullName=fullName
    }

}

fun main(){

    val person: Person7 = Person7("John", "Doe")
    println(person.fullName)

    val person2: Person7 = Person7("John Doe")
    println(person2.fullName)


}