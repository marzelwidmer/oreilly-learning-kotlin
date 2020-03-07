package ch.keepcalm.base.inheritance

open class Person() {
    open fun validate(){}
}

open class Customer : Person {
   final override fun validate (){

    }

    constructor(): super()
}

class SpecialCustomer: Customer(){
//    override fun validate() {
//        super.validate()
//    }
}

data class CustomerEntity(val name: String) : Person()


fun main() {
    val customer = Customer()
    customer.validate()
}