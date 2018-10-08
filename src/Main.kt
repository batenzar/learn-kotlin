import java.util.*

fun main(args: Array<String>) {
    //println("Good ${ if (args[0].toInt() <= 12)  "Morning" else "Night"}")
    // simple
//    if (args[0].toInt() <= 12) println("Good Morning")
//    else println("Good night")
    //feedTheFish()
    println(canAddFish(10.0, listOf(3, 3, 3))) //---> false
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)) //---> true
    println(canAddFish(9.0, listOf(1, 1, 3), 3)) //---> false
    println(canAddFish(10.0, listOf(), 7, true)) //---> true
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    val calTankSize = (tankSize * (if (hasDecorations) 80.0 / 100.0 else 1.0)).toInt()
    println("Tank size $calTankSize")
    var totalFish = fishSize;
    for (a in currentFish) {
        totalFish += a;
    }

    println("Total fish $totalFish")
    return totalFish <= calTankSize

    // Solution
//    fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
//        return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
//    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

