package ch.keepcalm.advanced.functions

fun foo(fooParam: String){
    val outerValue = "outer value"
    fun bar(barParam: String){
        println(barParam)
        println(fooParam)
        println(outerValue)
    }
}


fun main() {
    foo("Some Value")
}