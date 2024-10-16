//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val niz1= arrayOf("Amera", "Selma","Marija") //niz2: Array<String>
    println(java.util.Arrays.toString(niz1))
    for (n in niz1) {
        println(n)
    }
    println(" Prvi element niza je: ${niz1[0]}")

    niz1[0]= "Pero"
    println(java.util.Arrays.toString(niz1))
    //niz1[5]= "Pero"
    println("Velicina niza je: ${niz1.size}")

    val niz2= arrayOf(1,2,3,4,5) //niz2: Array<Int>
    println(niz2)
    val niz3= arrayOf(3,4,5,"Amera")

    for (x in niz3) {
        println(x)
    }

    // is kljucna rijec
    for (x in niz3) {
        if (x is Int)
            println(x)
        else
            println("Element $x is not an int")
    }

    for (x in niz3) {
        if (x is String)
            println(x)
        else
            println("Element $x is not a string")
    }

}