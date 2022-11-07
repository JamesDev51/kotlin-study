package week_11

interface Car {
    fun ride()
}

interface Aircraft {
    fun fly()
}

interface Ship {
    fun sail()
}

interface FlyingCar : Car, Aircraft

class Transformer : FlyingCar, Ship {
    override fun ride() {
        println("I'm riding")
    }

    override fun fly() {
        println("I'm flying")
    }

    override fun sail() {
        println("I'm sailing")
    }
}

fun main() {
    val t = Transformer()

    t.ride()
    t.fly()
    t.sail()

    val s: Ship = t
    s.sail()

    val fc : FlyingCar = t
    fc.fly()
    fc.ride()
}