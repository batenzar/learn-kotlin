package MyPlay

interface I1 {
    fun race()
    fun eat()
}

interface Eat {
    fun eat()
}

object Mr1: I1 {
    override fun eat(){
        println("eating veggy")
    }
    override fun race(){
        println("human")
    }
}

class Someone: I1 by Mr1{

}