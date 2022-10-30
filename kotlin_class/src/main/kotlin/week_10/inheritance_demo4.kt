package week_10

open class Vehicle3(){
    init{
        println("Vehicle 초기화")
    }
}

open class Car3 : Vehicle3() {
    init{
        println("Car 초기화")
    }
}

class Truck : Car3() {
    init {
        println("Truck 초기화")
    }
}

fun main() {
    val truck = Truck()

}