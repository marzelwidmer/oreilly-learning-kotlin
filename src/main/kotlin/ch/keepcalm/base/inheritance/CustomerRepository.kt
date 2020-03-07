package ch.keepcalm.base.inheritance

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true // Default implementation

    fun store(customer: Customer) {
        // implementation

    }
    fun getById(id: String) : Customer
}

class SqlCustomerRepository : CustomerRepository {

    override fun getById(id: String): Customer {
        return Customer()
    }

    override fun store(customer: Customer) {
        //super.store(customer)
    }

    override val isEmpty: Boolean
        get() = false
}


interface Interface1 {
    fun funA() = "Fun A from Interface 1"
}
interface Interface2 {
    fun funA() = "Fun A from Interface 2"
}
class Class1And2 : Interface1, Interface2 {
//    override fun funA() = "Out own"
    override fun funA() = super<Interface2>.funA()
}

fun main() {
    val c = Class1And2()
    val result = c.funA()
    println(result)
}