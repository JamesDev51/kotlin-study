package week_10

open class Person3(val name: String, val  age:Int)

class Student2 : Person3{
    val university: String

    //부생성자에서 super 호출 후 자기 필드 초기화
    constructor(name:String, age: Int, university: String) : super(name,age){
        this.university=university
}
}

fun main() {
    val student = Student2("Charlie", 23, "KAU")

    println(student.name)
    println(student.age)
    println(student.university)

}