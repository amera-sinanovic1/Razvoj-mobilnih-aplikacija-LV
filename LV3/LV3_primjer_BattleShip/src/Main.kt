class Battleship(private val scheme: Array<String>, private val target: Array<String>) {

    private val board = Array(5) { Array(5) { "○" } } // 5x5 board initialized with blanks
    private val ships = mutableMapOf<String, String>() // Map to track the ships on the board
    private val hitsMap = mutableMapOf<String, Boolean>() // Map to track the hit status of each ship cell

    init {
        // Place ships on the board
        for (coord in scheme) {
            val (row, col) = getCoordinates(coord)
            ships[coord] = "●"
            board[row][col] = "●" // Ship placed on board
        }

        // Apply the user's guesses
        for (guess in target) {
            val (row, col) = getCoordinates(guess)
            if (ships.containsKey(guess)) {
                board[row][col] = "☀" // Correct guess (hit)
                hitsMap[guess] = true
            } else {
                board[row][col] = "☼" // Wrong guess (miss)
            }
        }
    }

    // Converts string coordinate (e.g., "A1") to board indices (row, col)
    private fun getCoordinates(coordinate: String): Pair<Int, Int> {
        val row = coordinate[0] - 'A'
        val col = coordinate[1].digitToInt() - 1
        return Pair(row, col)
    }

    // Returns the final state of the board as a 5x5 matrix
    fun board(): Array<Array<String>> {
        return board
    }

    // Returns the total number of hits made by the user
    fun hits(): Int {
        return hitsMap.count { it.value }
    }

    // Returns the total number of sunk Cruisers
    fun sunk(): Int {
        var sunkCruisers = 0

        // Check for adjacent Cruiser cells (vertically or horizontally)
        for (coord in scheme) {
            val (row, col) = getCoordinates(coord)
            if (board[row][col] == "☀") {
                // Check right and down for adjacent hit cells (Cruiser sunk)
                if (col + 1 < 5 && board[row][col + 1] == "☀") {
                    sunkCruisers++
                } else if (row + 1 < 5 && board[row + 1][col] == "☀") {
                    sunkCruisers++
                }
            }
        }
        return sunkCruisers
    }

    // Returns the total points: 1 for every hit, plus 2 for each sunk Cruiser
    fun points(): Int {
        return hits() + (sunk() * 2)
    }
}

fun main() {
    // Example input
    val scheme = arrayOf("A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5")
    val target = arrayOf("A1", "B2", "C3", "D4", "E5", "E4")

    val battleship = Battleship(scheme, target)

    // Print the final board state
    for (row in battleship.board()) {
        println(row.joinToString(" "))
    }

    // Print the number of hits, sunk cruisers, and points
    println("Hits: ${battleship.hits()}")
    println("Sunk: ${battleship.sunk()}")
    println("Points: ${battleship.points()}")
}
