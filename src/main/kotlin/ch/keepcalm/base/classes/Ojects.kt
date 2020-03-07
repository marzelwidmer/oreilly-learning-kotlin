package ch.keepcalm.base.classes

// Global Object
// It`s a Singleton
object Global{
    val PI = 3.1415
}

fun main() {
    val localObject = object {
        val PI = 3.14
    }
    println(localObject.PI)
    println(Global.PI)
}