package week_12

import week_12.Direction.*

enum class Direction{
    NORTH, SOUTH, WEST, EAST

}

fun rotateClockwise(direction: Direction) = when (direction) {
    NORTH -> EAST
    EAST -> SOUTH
    SOUTH -> WEST
    WEST -> NORTH
}

fun main() {
    val dir = NORTH

    println(rotateClockwise(dir))

    println(Direction.valueOf("NORTH"))
    println(Direction.valueOf("NORTH_EAST"))

}