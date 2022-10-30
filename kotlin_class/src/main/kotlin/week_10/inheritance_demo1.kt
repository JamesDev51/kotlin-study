package week_10

//open이 붙은 클래스만 상속 가능
open class Vehicle {
    var currentSpeed = 0

    open fun start() {
        println("I'm moving ")
    }

    fun stop(){
        println("Stopped ")

    }
}



open class Car : Vehicle() {
    override fun start() {
        println("I'm riding ")
    }

}

class Bus : Car() {
    override fun start() {
        println("I'm riding a bus")
    }
}


class Boat: Vehicle(){
    override fun start() {
        println("I'm sailing ")
    }
}


//open이 붙은 클래스만 상속 가능
open class FlyingVehicle : Vehicle(){
    fun takeOff() {
        println("Taking off")
    }

    fun landing() {
        println("Landed")
    }
}

class Aircraft(val seat:Int): FlyingVehicle()

fun main() {
    val aircraft = Aircraft(100)
    val vehicle: Vehicle = aircraft //Vehicle에 정의된 메서드만 사용 가능

    vehicle.start()
    vehicle.stop()

    aircraft.start()
    aircraft.takeOff()
    aircraft.landing()
    aircraft.stop()
    println(aircraft.seat)

    val car: Car = Car()
    val vehicle1: Vehicle = Car()
    val vehicle2: Vehicle = Boat()
    vehicle1.start()
    vehicle2.start()
    car.start()

    vehicle1.stop()
    vehicle2.stop()
    car.stop()

}

