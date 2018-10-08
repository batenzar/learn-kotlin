import java.math.BigInteger

fun main(args:Array<String>){
println(boredFriends("1"))
    println(boredFriends("99999"))
}

fun boredFriends(n: String): Boolean {
    val i = BigInteger(n)
    val e = BigInteger("9");
    return i < e || BigInteger.ZERO != i.remainder(e);
}
