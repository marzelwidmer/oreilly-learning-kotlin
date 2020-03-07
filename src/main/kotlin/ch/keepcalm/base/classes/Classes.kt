package ch.keepcalm.base.classes

import java.lang.IllegalArgumentException
import java.util.*

class Customer(val id: Int, var name: String, val yearOfBirth: Int){
    // Custom getter
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    // Custom setter
    var soialSecurityNumbers: String = ""
        set(value) {
            if(!value.startsWith("SN")){
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value // set the field to the backing field used to read otherwise is only validated
        }

//    init {
//       name = name.toUpperCase()
//    }
//    constructor(email: String) : this(id = 0, name =  "")
}


fun main() {
    val customer = Customer(id = 1, name = "John", yearOfBirth = 1975)
//    val jane = Customer(id = 2)
//    Customer(email = "mymail@foobar.com")
//    val name = jane.name


    customer.name
    customer.id
    customer.soialSecurityNumbers = "SN1234"

    println(customer.name)
    println(customer.age)
    println(customer.soialSecurityNumbers)

}