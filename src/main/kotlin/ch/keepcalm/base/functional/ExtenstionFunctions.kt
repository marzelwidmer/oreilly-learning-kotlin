package ch.keepcalm.base.functional

import ch.keepcalm.base.utils.someUtility

fun String.Hello() {
    println("It`s me")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {
        it.capitalize()
    }
}

fun main() {

    val string = "Another one"
    "Hello".Hello()

    someUtility("this is a sample string to Title Case it.".toTitleCase())

    val customer =  Customer()
    customer.makePreferred("My new version")


}

class Customer(){
    fun makePreferred(){
        println("Customer version")
    }
}
fun Customer.makePreferred(message : String){
    println(message)
}