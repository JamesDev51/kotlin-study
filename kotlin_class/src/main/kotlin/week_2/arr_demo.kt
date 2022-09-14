package week_2

fun main(){
    val a = emptyArray<String>()
    val b = arrayOf("hello","world")
    val c = arrayOf(1,4,9)

    val size= readLine()!!.toInt()
    val squares = Array(size){(it+1)*(it+1)}
    for(n in squares.iterator()) print("$n ")

    println()
    println("size : ${squares.size}")
    println("lastIndex : ${squares.lastIndex}")
    squares[4]=123123
    for(n in squares.iterator()) print("$n ")

    val ref_squares = squares
    squares[3]=10000
    println(ref_squares[3])

    val cp_squares=squares.copyOf()
    squares[2]=1489
    println(cp_squares[2])

    val arr2 = arrayOf(1,4,6,16)
    val arr3= arr2+4
    for (n in arr3.iterator())println(n)

    println(arrayOf(1,4,6,16).contentEquals(arr2))



}