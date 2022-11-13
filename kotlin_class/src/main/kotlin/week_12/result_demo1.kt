package week_12

enum class Result{
    SUCCESS, ERROR
}

fun runComputation(): Result{
    val a = readLine()?.toIntOrNull() ?: return Result.ERROR
    val b = readLine()?.toIntOrNull() ?: return Result.ERROR

    println("Sum: ${a+b}")
    return Result.SUCCESS
}

fun main() {
    println(when (runComputation()) {
        Result.SUCCESS -> "Completed Successfully"
        Result.ERROR -> "Error!"
    })
}