package ch.keepcalm.advanced.functions

infix fun String.shouldBeEqualto(value: String) = this==value

fun main() {

    val output = "Hello"
    output shouldBeEqualto "Hello"
}