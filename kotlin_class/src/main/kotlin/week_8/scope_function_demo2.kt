package week_8

class Address2(var city: String, var street: String, var house: String){
    fun asText() = "$city, $street, $house"
}

fun main(){
    val address= run(){
        val city = readLine() ?: return
        val street = readLine() ?: return
        val house = readLine() ?: return
        Address2(city,street,house)
    }



    println(address.asText())
}