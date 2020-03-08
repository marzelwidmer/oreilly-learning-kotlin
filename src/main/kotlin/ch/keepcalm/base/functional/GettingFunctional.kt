package ch.keepcalm.base.functional

//higher order function, because it takes two integers and then it takes another function,
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operator(x: Int, op: (Int) -> Unit) {}

fun route(path: String, vararg actions: (String, String) -> String) {}

fun unaryOperation(x: Int, op: (Int) -> Int) {}

fun unaryOp(op: (Int) -> Int) {}
fun sum(x: Int, y: Int) = x + y

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main() {
    val result = operation(x = 1, y = 2, op = ::sum) // ref function by name
    println(result)


    // Lambda expression
    operation(x = 1, y = 2, op = { x: Int, y: Int -> x + y })
    operation(1, 2, { x, y -> x + y })

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(1, 2, sumLambda)

    unaryOperation(2, { x -> x * x })
    unaryOperation(3, { it * it })

    unaryOperation(3) { it * it }

    unaryOp { it * it }

    unaryOp {
        it * it
    }

    val db = Database()
    transaction(db) {
        // Interact with database
    }

    // Anonymous function
    unaryOperation(3, fun(x: Int): Int { return x * x })
}