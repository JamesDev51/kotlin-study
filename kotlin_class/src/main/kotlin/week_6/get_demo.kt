package week_6

class Person2(val firstName: String, val familyName:String, age:Int){
    val age= age
        get(){
            println("Getter was called")
            return field
        }
//    val fullName: String = "$firstName $familyName"
    val fullName: String
        get(){
            println("get() has been called")
            return "$firstName $familyName"
        }
}
fun main(){
    val p = Person2("Charlie", "Kim",40)

    println(p.age)

    println("before printing Full name")

    println(p.fullName)
}