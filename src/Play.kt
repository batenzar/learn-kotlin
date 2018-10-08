fun main(args:Array<String>){
    val b = A("s1", "s2")
    val (a1:String) = b

    println(a1)
    //////////
//    testWhen()
//    a()
//    a(50)
//    a(50, speed="slow")
//    a(speed = "slow", time = 50)
//
//    repeat(2, { println("Hello")})
//
//    val lambda: () -> Unit = { println()}
//    // while can use break but repeat can't
//    var i = 0;
//    while (i < 5){
//        i++
//        break;
//    }
//    repeat(5){
//        break
//    }
}

fun a(time:Int, speed:String = "Fast"){
    println("Speed is ${speed}")
}
//
//fun a(time:Int, speed1:String){
//    println("Speed is ${speed1}")
//}
fun a(){
    println("Time is null")
}

fun a(time:Int = 50){
    println("Time is ${time}")
}

fun testWhen() {
    when {
        true -> println("Hello")
        else -> println("Bye")
    }
}

data class A (val p1:String, val p2:String)