import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//IF-ELSE

    val broj=10
    if (broj%2==0){
       println("Broj $broj je paran ")
    }
    else
        println("Broj $broj je neparan")

// Unijeti dva broja sa tast. i provjeriti koji je veci
    val input = Scanner(System.`in`) // Initializes the Scanner
    println("Unesite dva broja: ")
    val a = input.nextInt() // Reads a whole string line. For example: "Hello, Kotlin"
    val b = input.nextInt()
    if (a > b) {
        print("Unijeli ste brojeve $a i $b. Veci broj je broj $a")
    }
    else
        println("Unijeli ste brojeve $a i $b. Veci broj je broj $b")

    // provjeriti je li broj paran, ako nije je li djeljiv sa 3.
    println("Unesite  broj: ")
    val x = input.nextInt()
    if (x %2==0) {
        println("Broj je paran")
    }
    else if (x%3==0)
        println("Broj je djeljiv sad 3")
    else
        println("Broj nije paran niti je djeljiv sad 3")



}