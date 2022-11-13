package week_12

import week_12.RainbowColor.*

enum class RainbowColor(val isCold: Boolean) {
    RED(false), ORANGE(false), YELLOW(false), GREEN(true),
    BLUE(true), INDIGO(true), VIOLET(true);

    val isWarm get() = !isCold

}
val rainBowColors = RainbowColor.values()
fun RainbowColor.nextColor()  = rainBowColors[(ordinal+1)% rainBowColors.size]


fun main(){
    println(RainbowColor.BLUE.isCold)
    println(RainbowColor.RED.isCold)

    println(RED==BLUE)

    println(YELLOW != INDIGO)

    println(YELLOW > ORANGE)

    println(RED.nextColor())
    println(VIOLET.nextColor())
}