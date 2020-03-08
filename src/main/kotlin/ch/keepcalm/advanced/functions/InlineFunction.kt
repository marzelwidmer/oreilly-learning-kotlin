package ch.keepcalm.advanced.functions

// this will copy the function in the byte code method where is it used.
inline fun operation(op: () -> Unit){
    println("Before calling op()")
    op()
    println("After calling op()")
}

fun main() {
    operation {
        println("This is the actual op function")
    }
}