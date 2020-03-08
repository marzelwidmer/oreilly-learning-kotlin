package ch.keepcalm.advanced.delegation

import ch.keepcalm.base.functional.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}




// Delegation Member Functions
class Controller(repository: Repository, service: Service) : Repository by repository{

    fun index() {
        getAll()
        getById(id = 1)
    }
}