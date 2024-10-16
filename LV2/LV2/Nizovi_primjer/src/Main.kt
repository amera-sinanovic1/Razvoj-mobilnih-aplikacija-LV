//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Kreirati funkciju koja ce kao argument uzimati Array<int> i odrediti najvecii broj u nizu.
    // Kreirati funkciju koja ce kao argument uzimati Array<int> i odrediti najmanj broj u nizu.
    //Kreirati funkciju koja ce kao argument uzimati Array<int> i odrediti najveci ili najmanji broj u nizu.

    val niz1 = arrayOf(4,5,9,12,56,2,-7)
    val min=findMin(niz1)
    println("Najmanja vrijednost u nizu je: $min")
    val max=findMax(niz1)
    println("Najveca vrijednost u nizu je: $max")

    val max1=findMinAndMax(niz1,true)
    println("Najveca vrijednost u nizu je: $max1")
    val min1=findMinAndMax(niz1,false)
    println("Najmanja vrijednost u nizu je: $min1")


}

fun findMax(niz: Array<Int>): Int {
    var max = niz[0]
    for (i in niz) {
        if (i > max)
        max = i
    }
    return max
}

fun findMin(niz: Array<Int>): Int {
    var min = niz[0]
    for (i in niz) {
        if (i < min)
        min = i
    }
    return min
}

fun findMinAndMax(niz: Array<Int>, searchMax: Boolean): Int {
    var max = niz[0]
    if (searchMax) {
        for (i in niz) {
            if (i > max)
                max = i
        }
        return max
    } else {
        var min = niz[0]
        for (i in niz) {
            if (i < min)
                min = i
        }
        return min
    }

}