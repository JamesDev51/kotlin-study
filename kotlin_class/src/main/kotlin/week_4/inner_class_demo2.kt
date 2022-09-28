package week_4

class Person_inner(val firstName: String, val familyName: String) {
    inner class Possession(val description:String){
        fun showOwner() = println(fullName())
        fun getOwner() = this@Person_inner
    }
    private fun fullName() = "$firstName $familyName"
}

fun main(){
    val person=Person_inner("John","Doe")
    val wallet = person.Possession("Wallet")
    wallet.showOwner()
    println(wallet.getOwner())
}