package Aquarium

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    val volumn: Int
    get() = width * height * length /1000
}
