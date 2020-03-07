package ch.keepcalm.base.classes

enum class Priority (val value: Int){
    MINOR(-1){
        override fun text(): String {
            return "MINOR - Priority"
        }
        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "NORMA - Priority"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "MAJOR  - Priority"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "CRITICAL  - Priority"
        }
    };  // SEE the Fxxxxx ;

    abstract fun text(): String
}

fun main() {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.text())

    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.ordinal)
    println(Priority.CRITICAL.name)

    for (priorityInList in Priority.values()){
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)

}
