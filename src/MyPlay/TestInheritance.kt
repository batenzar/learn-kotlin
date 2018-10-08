package MyPlay

fun main(args: Array<String>) {
    println("1: ${TestInheritance().p1}")
    println("1: ${B().p1}")
}

open class TestInheritance {
    open val p1: Int = 1
}

class B : TestInheritance() {
    override val p1 = 2
}