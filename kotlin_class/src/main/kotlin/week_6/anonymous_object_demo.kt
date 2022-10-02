package week_6

fun main(){
    fun midPoint(xRange: IntRange, yRange: IntRange) = object{ //한번 호출될 때마다 익명의 object가 하나씩 생성됨
        val x=(xRange.first + xRange.last) / 2
        val y=(yRange.first + yRange.last) / 2
    }

    val midA = midPoint(1..3, 3..17)
    val midB= midPoint(9..29, 30..40)
    println("${midA.x}, ${midA.y}")
    println("${midB.x}, ${midB.y}")
}