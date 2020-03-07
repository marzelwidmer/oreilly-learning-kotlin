package ch.keepcalm.base.`null`

import ch.keepcalm.CustomerJava


class Service {
    fun  evaluate(){}
}
class ServiceProvider {
    fun createService(): Service? {
        return Service()
    }
}

fun main() {

    val message : String = "My awesome message"
    val nullMessage : String? = null
    val inferredNull = null

    println(message.length)

    if(nullMessage != null) {
        println(nullMessage.length)
    }

    //  Nicer way is this..
    println(nullMessage?.length) // will print null but not a NullPinterException

    val sp = ServiceProvider()
    sp.createService()?.evaluate()



    // NullPointer at runtime
    println(nullMessage!!.length)

    val customerJava = CustomerJava()
    println(customerJava.name.length) // NullPointerException on Runtime
}