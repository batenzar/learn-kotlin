// My solution
fun main(args: Array<String>) {
    val intList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var result = myDivided(intList) {
        this % 3
    }
    println(result.toString())
}

fun myDivided(input: List<Int>, block: Int.() -> Int): List<Int> {

    val result = mutableListOf<Int>()
    input.forEach {
        if (block(it) == 0) {
            result.add(it)
        }
    }

    return result
}



///
// Course solution
////
//fun main(args: Array<String>) {
//    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
//    print(numbers.divisibleBy {
//        it.rem(3)
//    })
//}
//
//
//fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
//    val result = mutableListOf<Int>()
//    for (item in this) {
//        if (block(item) == 0) {
//            result.add(item)
//        }
//    }
//    return result
//}