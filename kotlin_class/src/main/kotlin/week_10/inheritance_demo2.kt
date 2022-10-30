package week_10

open class Entity {
    open val name: String get() = ""
}

open class Person(): Entity(){
    override var name="" //상위 val -> 하위 var 가능함. 하지만 역은 x

}


fun main() {

    val person = Person()

}