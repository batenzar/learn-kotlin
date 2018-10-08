import java.util.*

fun main(args: Array<String>) {

    for (i in 1..10) {
        val fortune = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune")
        if (fortune.startsWith("Take it"))
            break
    }
}

fun getBirthday():Int {
    println("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday:Int): String {
    val cookies = arrayOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    val index = when (birthday) {
        28, 31 -> 2
        in 1..7 -> 2
        else -> birthday.rem(7)
    }
    return cookies[index]
}