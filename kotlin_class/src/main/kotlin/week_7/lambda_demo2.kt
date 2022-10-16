package week_7
fun countInArray(arr:IntArray, isTrue: (Int)-> Boolean):Int{
		var count = 0
		for(elem in arr){
				if(isTrue(elem)) count++
		}
		return count
}

fun main(){
		val arr= intArrayOf(-1,-2,-3,0,0,0,1,2,3,4,5)
		println(countInArray(arr,{elem -> elem%2==0}))
		println(countInArray(arr,{elem -> elem<0}))
		println(countInArray(arr,{elem -> elem==0}))

}