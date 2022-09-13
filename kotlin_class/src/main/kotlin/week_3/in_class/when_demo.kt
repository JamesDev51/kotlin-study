package week_3.in_class

fun hexDigitIf(n: Int): Char{
    if(n in 0..9) return '0' + n
    else if(n in 10..15) return 'A'+ n-10
    else return '?'
}

fun hexDigitWhen(n: Int):Char{
    when{
        n in 0..9 -> return '0'+n
        n in 10 .. 15 -> return 'A'+ n-10
        else -> return '?'
    }
}
fun hexDigitWhenExpression(n: Int):Char{
    return when{
        n in 0..9 ->  '0'+n
        n in 10 .. 15 ->  'A'+ n-10
        else ->  '?'
    }
}
fun hexDigitWhenExpressionOneLine(n: Int):Char = when (n) {
    in 0..9 -> '0'+n
    in 10 .. 15 -> 'A'+ n-10
    else -> '?'
}

fun main(){

    val n =readLine()!!.toInt()

//    println(hexDigitIf(n))
//    println(hexDigitWhen(n))
//    println(hexDigitWhenExpression(n))
    println(hexDigitWhenExpressionOneLine(n))
}
