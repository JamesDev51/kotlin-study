package week_7

fun add(result:Int, elem: Int)=result+elem

fun aggregate(arr:IntArray, initValue: Int, op: (resultSoFar: Int, elem: Int)-> Int):Int{
		var result=initValue

		for(elem in arr){
				result =op(result,elem)
		}
		return result
}

fun main(){
		val arr = intArrayOf(-2,-1,1,2,3,4,5)
		println(aggregate(arr, 0,{result, elem -> result + elem})) //sum
		println(aggregate(arr, 1){result, elem -> result * elem}) //prod
		println(aggregate(arr, Int.MIN_VALUE){result, elem ->if(result>elem) result else elem}) //max
		println(aggregate(arr, 0) {result,elem ->
				println("$result += $elem")
				result+elem
		})

		//람다함수 대신에 참조하기
		println(aggregate(arr, 0){result,elem -> result+elem})
		println(aggregate(arr, 0,::add))
}