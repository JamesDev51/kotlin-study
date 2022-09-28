package week_4

class Person5(val firstName: String, familyName: String){
    val fullName="$firstName $familyName"
    
    fun printFirstName(){
        println(firstName)
    }

}

fun main(){
    val person5=Person5("John","Doe")

    person5.printFirstName()
}