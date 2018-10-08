package Spices

fun main(args:Array<String>){
println("SpiceColor ${Curry("mild").color}")
}


sealed class Spice (var name:String, var spiciness:String = "mild"): SpiceColor by YellowSpiceColor{

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init{
        println("Created ${name} Spiciness ${spiciness}")
    }

    abstract fun prepareSpice()
}

class Curry(var spicines:String): Spice("Curry", spicines), Grinder{
    override fun grin() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

interface SpiceColor {
    val color:Color
}
enum class Color(rgb:Int){
    YELLOW(0xFFFF00)
}

object YellowSpiceColor:SpiceColor{
    override val color: Color = Color.YELLOW
}

interface Grinder {
    fun grin()
}

data class SpiceContainer(val spice:Spice)