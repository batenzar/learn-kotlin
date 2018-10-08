package MyPlay

abstract class A{
    abstract val p1:Int
    abstract fun eat()
}

class B1(override val p1:Int) : A(){
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}