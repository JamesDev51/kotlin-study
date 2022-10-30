package week_10

class Address(
    val city: String,
    val street: String,
    val house: String
){
    override fun equals(other:Any?): Boolean {
        if (other !is Address) return false
        if(city==other.city && street ==other.street && house==other.house) return true
        return false
    }

    override fun hashCode(): Int {
        var code = city.hashCode()
        code = 31*code + street.hashCode()
        code = 31*code + house.hashCode()
        return code
    }

    override fun toString(): String {
        return "$city, $street, $house"
    }
}

fun main() {
    val addr1 = Address("Seoul","Mapodae-ro","5")
    val addr2 = Address("Seoul","Mapodae-ro","5")

    println(addr1==addr2)
    println(addr1.hashCode())
    println(addr2.hashCode())

    println(addr1)
    println(addr2)
}

