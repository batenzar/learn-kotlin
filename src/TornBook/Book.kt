package TornBook

import java.util.*

fun main(args:Array<String>){
    val book = Book(300)
    Puppy(book).playWithBook()
println("Remaining ${book.pages} weight ${book.getWeight()}")
}

class Book (var pages:Int){

}

fun Book.getWeight():Double{
    return pages * 1.5
}
fun Book.tornPages(tornPage:Int){
    println("Torn ${tornPage} pages")
    pages -= tornPage
}

class Puppy(var book:Book){
    fun playWithBook(){
        book.tornPages(Random().nextInt(10))
    }
}
