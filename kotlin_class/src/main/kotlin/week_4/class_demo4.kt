package week_4

class Person4(fullName: String){
    val firstName:  String
    val familyName: String
    init{
        val names = fullName.split(" ")

        if(names.size ==2) {
            firstName = names[0]
            familyName = names[1]
        }else{
            firstName=""
            familyName=""
        }

    }
}

fun main(){
    val person3=Person3("John Doe")

    println(person3.firstName)
    println(person3.familyName)
}