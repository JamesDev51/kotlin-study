package week_4

class Person_id(val id: Id, val age: Int){
    class Id(val firstName: String, val familyName: String)

    fun showMe() = println("$id.firstName $id.familyName :  age")
}

fun main(){
    val id=Person_id.Id("John","Doe")
    val person=Person_id(id,25)
    person.showMe()
}