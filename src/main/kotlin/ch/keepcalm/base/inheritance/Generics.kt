package ch.keepcalm.base.inheritance

interface Repository<T>{
    fun getById(id: Int): T
    fun getAll(): List<T>
}





fun main() {
    val customerRepository = GenericRepository<Customer>()
    val customer = customerRepository.getById(10)
    val cutomers = customerRepository.getAll()

    val personRepository = GenericRepository<Person>()
    val person = personRepository.getById(10)
    val persons = personRepository.getAll()
}