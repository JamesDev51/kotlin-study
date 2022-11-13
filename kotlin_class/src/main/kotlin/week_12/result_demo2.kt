package week_12

import kotlin.Exception

sealed class Result2{
    class Success(val value:Any):Result2(){
        fun showResult() {
            println(value)
        }
    }

    class Error(val message:String) : Result2(){
        fun throwException() {
            throw Exception(message)
        }
    }

}

fun runComputation2():Result2{
    val a = readLine()!!.toIntOrNull() ?: return Result2.Error("Error!")
    val b = readLine()!!.toIntOrNull()?: return Result2.Error("Error!")

    return Result2.Success(a+b)
}


fun main() {
    println(
        when (val result = runComputation2()) {
            is Result2.Success -> "Completed Successfully : ${result.value}"
            is Result2.Error -> "Error: ${result.message}"
        }
    )
}