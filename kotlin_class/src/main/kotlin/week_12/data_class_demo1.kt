package week_12

import java.security.DomainLoadStoreParameter

data class Person(
    val firstName: String,
    val familyName: String,
    val age: Int
)

data class MailBox(val address: String, val person: Person)

fun Person.show() {
    println("$firstName $familyName $age")
}

fun main() {
    val person = Person("John", "Doe", 25)
    val mailbox1 =  MailBox("Unknown", person)
    val mailbox2 =  MailBox("Unknown", Person("John","Doe",25))
    println(mailbox1==mailbox2)

    val (firstName, familyName, _) = person

    println("$firstName $familyName is my frient")

    println(person)

    person.show()
    person.copy().show()
    person.copy(familyName="Smith").show()
    person.copy(firstName = "Jane",age=30).show()
}
