package ch.keepcalm.advanced.delegation

import kotlin.properties.Delegates

class Veto {
    // Only change the value when it start with S
    var value: String by Delegates.vetoable("String") { prop, old, new -> new.startsWith("S")}
}

fun main() {
    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}