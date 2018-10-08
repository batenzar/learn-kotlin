package function.game

fun main(args: Array<String>) {
var game = Game()
    game.north()
    game.south()
    game.east()
    game.west()

    game.end()

}

enum class Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game() {
    var path = mutableListOf(Direction.START)

    var north = { path.add(Direction.NORTH) }
    var south = { path.add(Direction.SOUTH) }
    var east = { path.add(Direction.EAST) }
    var west = { path.add(Direction.WEST) }
    var end = {
        path.add(Direction.END)
        println("Game Over")
        println("Path: ${path.toString()}")
        path.clear()

        false // return value
    }

}