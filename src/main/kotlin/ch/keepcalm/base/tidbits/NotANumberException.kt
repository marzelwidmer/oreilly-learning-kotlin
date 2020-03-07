package ch.keepcalm.base.tidbits

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader

class NotANumberException(message: String) : Throwable(message)


fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}


fun main() {

//    try {
//        checkIsNumber('A')
//    } catch (e: IllegalArgumentException) {
//        println("Do nothing")
//    } catch (e: NotANumberException) {
////        println("This is not a number")
//        println("${e.message}")
//    }

    val result = try {
        val buffer = BufferedReader(FileReader("input.txt"))
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: FileNotFoundException) {
        -1
    } finally {
        -2
    }
    println(result)
}