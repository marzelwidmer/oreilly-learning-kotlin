package ch.keepcalm.base.inheritance

abstract class StoredEntity{
    val isActive = true
    abstract fun store()
    fun status(): String{
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {
        println("Store.....")
    }
}


fun main() {
    val emp = Employee()
    emp.store()
    emp.isActive
    val status = emp.status()
    println(status)
}