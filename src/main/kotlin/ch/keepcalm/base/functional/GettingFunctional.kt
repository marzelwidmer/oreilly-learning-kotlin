package ch.keepcalm.base.functional

//higher order function, because it takes two integers and then it takes another function,
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x,y)
}
fun operator(x: Int, op: (Int) -> Unit)  {
}

fun route(path: String, vararg actions: (String, String) -> String){

}


fun sum(x: Int, y: Int) = x + y



fun main() {
    val result = operation(x = 1, y = 2, op = ::sum) // ref function by name
    println(result)
}