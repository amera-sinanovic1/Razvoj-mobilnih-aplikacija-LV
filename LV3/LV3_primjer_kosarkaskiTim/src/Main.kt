fun main() {
    // Primjeri testova
    println(bestTeamScore(intArrayOf(1, 3, 5, 10, 15), intArrayOf(1, 2, 3, 4, 5)))  // Izlaz: 34
    println(bestTeamScore(intArrayOf(4, 5, 6, 5), intArrayOf(2, 1, 2, 1)))           // Izlaz: 16
    println(bestTeamScore(intArrayOf(1, 2, 3, 5), intArrayOf(8, 9, 10, 1)))         // Izlaz: 6
}


fun bestTeamScore(scores: IntArray, ages: IntArray): Int {
    // Spajamo scores i ages u listu parova i sortiramo ih prema dobi, a zatim prema rezultatu
    val players = ages.zip(scores).sortedWith(compareBy({ it.first }, { it.second }))

    // Inicijalizacija dp niza za čuvanje najboljeg rezultata tima do svakog igrača
    val dp = IntArray(players.size)

    // Postavljamo početne vrijednosti rezultata za svakog igrača
    for (i in players.indices) {
        dp[i] = players[i].second  // Početni rezultat je rezultat tog igrača

        // Pokušavamo izgraditi tim do trenutnog igrača
        for (j in 0 until i) {
            if (players[j].second <= players[i].second) {  // Nema sukoba, stariji igrač ima manji ili jednak rezultat
                dp[i] = maxOf(dp[i], dp[j] + players[i].second)  // Ažuriramo maksimalni rezultat
            }
        }
    }

    // Vraćamo maksimalni rezultat tima
    return dp.maxOrNull() ?: 0
}


