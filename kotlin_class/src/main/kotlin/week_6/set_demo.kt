package week_6

class Person3(val firstName: String, familyName: String){
    var age:Int? =null
        set(value){
            if(value!=null && value<=0) throw IllegalArgumentException("Invalid age: $value")

            field=value
        }
}

fun main(){
    val p = Person3("Charlie","Kim")
    p.age=20
    println(p.age)

    p.age= -2
}