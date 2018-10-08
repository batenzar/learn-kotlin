fun main(args:Array<String>){
val (name,author,year) = getBook()
    println("${name} ${author} ${year}")
}

fun getBook(): Triple<String,String,String>{
    return Triple("Name", "Author", "Year")
}