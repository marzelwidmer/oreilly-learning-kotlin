package ch.keepcalm.base.stdlib

import java.io.File

fun main() {

    val file = File("filename.txt")

    with(file) {
        println(isAbsolute)
        println(name)
    }

    val string: String? = "Some value"
    string?.let {
        println(it)
    }
}