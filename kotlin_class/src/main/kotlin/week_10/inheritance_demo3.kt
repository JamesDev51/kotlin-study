package week_10

open class Vehicle2 {
    protected open fun onStart(){}
    fun start() {
        println("Starting up....")
        onStart()
    }
}

class Car2: Vehicle2(){
    override fun onStart() {
        println("It's a car")
    }
}

fun main() {
    val car = Car2()
    car.start()

}