package ch.keepcalm.advanced.delegation

import ch.keepcalm.base.functional.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}


interface Service {
    fun callService(): String
}


class ServiceImpl : Service {
    override fun callService(): String {
        TODO("Not yet implemented")
    }

}


// Delegation Member Functions
class Controller(repository: Repository, service: Service) : Repository by repository, Service by service{

    fun index() {
        getAll()
        getById(id = 1)
        callService()
    }
}