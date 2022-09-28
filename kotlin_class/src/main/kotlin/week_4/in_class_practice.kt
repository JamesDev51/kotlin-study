package week_4

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Point(val x: Double, val y: Double)

class Rectangle(private val leftBottom: Point, private val rightTop: Point) {
    init{
        if(rightTop.x<=leftBottom.x || rightTop.y<=leftBottom.y) throw IllegalArgumentException()
    }

    fun overlappingRectangle(another: Rectangle): Rectangle{
        if(another.rightTop.x<=leftBottom.x || rightTop.x<=another.leftBottom.x || another.rightTop.y<=leftBottom.y || rightTop.y<=another.leftBottom.y) throw NoSuchElementException()

        val leftBottom = Point(max(leftBottom.x,another.leftBottom.x), max(leftBottom.y,another.leftBottom.y))
        val rightTop = Point(min(rightTop.x,another.rightTop.x), min(rightTop.y,another.rightTop.y))
        return Rectangle(leftBottom,rightTop)
    }
    fun printRectangle(){
        println("직사각형 좌:${leftBottom.x.toInt()}, 우:${rightTop.x.toInt()}, 하:${leftBottom.y.toInt()}, 상:${rightTop.y.toInt()}")
    }
}

fun main(){
    try {
        println("직사각형 1의 대각점 1의 좌표를 입력하시오: ")
        val p1X = readLine()!!.toDouble()
        val p1Y = readLine()!!.toDouble()
        println("직사각형 1의 대각점 2의 좌표를 입력하시오: ")
        val p2X = readLine()!!.toDouble()
        val p2Y = readLine()!!.toDouble()
        val r1 = Rectangle(Point(p1X, p1Y), Point(p2X, p2Y))
        println("직사각형 2의 대각점 1의 좌표를 입력하시오: ")
        val p3X = readLine()!!.toDouble()
        val p3Y = readLine()!!.toDouble()
        println("직사각형 1의 대각점 2의 좌표를 입력하시오: ")
        val p4X = readLine()!!.toDouble()
        val p4Y = readLine()!!.toDouble()
        val r2 = Rectangle(Point(p3X, p3Y), Point(p4X, p4Y))
        r1.overlappingRectangle(r2).printRectangle()
    } catch (e: IllegalArgumentException) {
        println("직사각형이 잘못 입력되었습니다.")
    } catch (e: NoSuchElementException) {
        println("직사각형이 겹치지 않습니다.")
    }
}