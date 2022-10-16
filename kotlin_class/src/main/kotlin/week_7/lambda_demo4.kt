package week_7

fun measureTime(action:()->Unit):Long{
		val start=System.nanoTime()
		action()
		return System.nanoTime()-start
}
fun main(){
		val time = measureTime { 1+2 }
		println("time: $time")
		val arr = IntArray(10){it*it}
}