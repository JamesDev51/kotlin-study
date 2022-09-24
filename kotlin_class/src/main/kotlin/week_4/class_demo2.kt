package week_4

class Person2(firstName:String, familyName: String){
    val fullName = "$firstName $familyName"
    var age: Int = 0

    fun showMe(){
        println("$fullName : $age")
    }
}

fun main(){
    val person2=Person2("John","Doe")

    println(person2.fullName)
}