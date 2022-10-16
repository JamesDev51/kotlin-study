package week_7

fun initializeIntArray(n:Int, initializer: (Int)->Int):IntArray{
		val arr= IntArray(n)

		for(i in 0 until n ){
				arr[i]=initializer(i)
		}

		return arr
}

fun main(){
		val arr = initializeIntArray(5){it*it}
		for (i in arr.iterator())println(i)
}