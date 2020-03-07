package ch.keepcalm.base.tidbits

open class Person

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("ou need more vacation")
        }
    }
}

class Contractor: Person ()

fun hasVacations (obj: Person){
    if(obj is Employee) {
        obj.vacationDays(20)
    }
}

var input : Any = 10

fun main() {
//     val str = input as String // ClassCastException
//    println(str.length)

    val str = input as? String
    println(str?.length)
}