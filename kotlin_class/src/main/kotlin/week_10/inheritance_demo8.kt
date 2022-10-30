package week_10

open class Person5(val name: String, val  age:Int){
    open fun showInfo() {
        println("$name, $age")
    }
    init{
        showInfo()
    }
}

class Student4 (name:String, age: Int, val university: String): Person5(name,age){
    override fun showInfo(){
        println("$name, $age: ($university)")
    }
}

fun main() {
    val student = Student4("Charlie", 23, "KAU")

}