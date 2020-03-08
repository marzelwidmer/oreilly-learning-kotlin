package ch.keepcalm.base.stdlib

fun main() {
    val elements = 1..10000000000

//    val output = elements.filter { it < 30 }.map { Pair("Yes", it) }
    val output = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
    output.forEach {
        println(it)
    }

//    val output = elements.asSequence().take(30).sum()
//    println(output)

    val numbers = generateSequence(1) {
            x -> x * 10
    }
    println(numbers.take(30).sum())

    val lazyInit : Int by lazy { 10 }

}