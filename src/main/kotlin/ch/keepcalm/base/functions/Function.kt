package ch.keepcalm.base.functions

import ch.keepcalm.base.utils.someUtility
import java.lang.Exception

fun hello() {
    someUtility("Hello")
}

fun thwowingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnAFout(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String, phone: String) = println("name: $name - email: $email - phone: $phone")


fun main() {
    hello()

    val value = returnAFout()

    takingString("Some Value")
    println("4+6 = ${sum(4, 6)}")
    sum(x = 4, y = 4, z = 10)

    printDetails(name = "Foo", phone = "+41 222 333 44", email = "foo@bar.com")
}