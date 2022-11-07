package week_11

interface Vehicle {
    val currentSpeed: Double
    val isMoving get() = currentSpeed!=0.0
    fun start()
    fun stop()
    fun report(){
        println(if(isMoving) "Moving at $currentSpeed" else "Still")
    }
}

class Car2 : Vehicle {
    override var currentSpeed: Double = 0.0
        private set

    override fun start() {
        println("Start riding")
        currentSpeed=50.0
    }

    override fun stop() {
        println("Stop riding")
        currentSpeed=0.0
    }
}

fun main() {
    val v: Vehicle = Car2()

    v.start()
    v.report()

    v.stop()
    v.report()
}