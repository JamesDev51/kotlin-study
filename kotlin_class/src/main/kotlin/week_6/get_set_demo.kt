package week_6

class Person4(var firstName: String, var familyName: String){
    var fullName: String
        get() = "$firstName $familyName"
        set(value){
            val names= value.split(" ")
            if(names.size!=2) throw IllegalArgumentException("Invalid Full Name: $value")
            firstName= names[0]
            familyName=names[1]
        }
}

fun main(){
    val p =Person4("Charlie","Kim")

    p.fullName = "Gildong Hong"
    println(p.firstName)
    println(p.familyName)
    println(p.fullName)
}