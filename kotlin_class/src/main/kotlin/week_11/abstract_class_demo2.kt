package week_11

import kotlin.math.PI

abstract class Shape {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override val width: Double
        get() = radius *2
    override val height: Double
        get() = radius*2

    override fun area(): Double = PI * radius * radius
}

class Rectangle(override val width: Double, override val height: Double) : Shape() {
    override fun area(): Double = width * height
}

fun main() {
    val circle: Shape = Circle(1.0)

    println(circle.area())

    val rectangle: Shape = Rectangle(1.0, 2.0)

    println(rectangle.area())
}