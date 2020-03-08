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


}