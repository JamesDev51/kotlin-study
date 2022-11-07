package week_11

abstract class Entity(val name: String)

class Person : Entity{
    constructor(name: String) : super(name)
    constructor( firstName: String, familyName: String)
            : super("$firstName $familyName")
}

fun main() {
//    val entity = Entity("Charles") 추상클래스라서 불가능

    val entity:Entity = Person("Charles", "King")

    println(entity.name)


}