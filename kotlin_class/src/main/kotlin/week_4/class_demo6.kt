package week_4

class Person6{
    val fullName: String
    constructor(firstName: String, familyName:String)  {
        fullName= "$firstName $familyName"

    }
    constructor(fullName: String) {
        this.fullName=fullName
    }

}

fun main(){

    val person: Person6 = Person6("John", "Doe")
    println(person.fullName)

    val person2: Person6 = Person6("John Doe")
    println(person2.fullName)


}