package week_3

import kotlin.math.PI

fun circleArea(radius: Double):Double{
    return PI*radius*radius
}
fun circleArea2(radius:Double):Double= PI*radius*radius
fun circleArea3(radius:Double)= PI*radius*radius

fun rectangleArea(width:Double, height:Double)=width*height

fun prompt(name:String){
    println("*** Hello, $name***")
}

fun main(){
    print("Enter radius: ")
    val radius = readLine()!!.toDouble()
    println("Circle area: ${circleArea(radius)}")

    val name = "minseok"
    prompt(name)
}