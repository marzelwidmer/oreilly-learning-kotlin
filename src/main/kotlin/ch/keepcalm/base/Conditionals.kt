package ch.keepcalm.base

fun main() {

    val myString = "Not Empty"

    val result = if (myString != ""){
        "A string"
    } else {
        "A other String"
    }
    println(result)

    val result2 = "Value"
    when(result2){
        "Value" -> println("A value")
        is String -> println("Excellent")
    }
    println(result2)

    val whenValue = when(result2){
        "Value" -> {
            println("It`s a value")
            println("Second statement")
            "Returning from first when case"
        }
        is String -> {
            println("Excellent")
            "Remove that this is allays true"
        }
        else -> {
            println("It came tho this?")
            "This warning is now gone"
        }
    }
    println(whenValue)

}