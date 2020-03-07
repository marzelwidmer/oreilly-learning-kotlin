package ch.keepcalm.base.classes

import ch.keepcalm.CustomerJava
import ch.keepcalm.base.utils.someUtility


data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        return "{\"id\":  \"$id\", \"name\":  \"$name\"}\n"
    }
}

fun main() {
    val customer1 = CustomerKotlin(id=1, name = "John", email = "john@doe.com")
    val customer2 = CustomerKotlin(id=2, name = "John", email = "jane@doe.com")

    val customer3 = customer1
    if(customer1 == customer2){
        println("They are the same")
    }

    println(customer3.id)
    val customer4 = customer1.copy(email = "test")
    println(customer4.id)
    println(customer4.name)
    println(customer4.email)

    println(customer1)

    val customerJava = CustomerJava(3, "Jane", "jane@doe.com")
    println(customerJava)
}