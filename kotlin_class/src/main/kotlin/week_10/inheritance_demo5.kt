package week_10

open class Person2(val name: String, val  age:Int)

class Student(name: String, age: Int, val university: String) : Person2(name,age) //super 클래스 생성자로 매개변수 넘겨줌

fun main() {
    val student = Student("Charlie", 23, "KAU")

    println(student.name)
    println(student.age)
    println(student.university)

}