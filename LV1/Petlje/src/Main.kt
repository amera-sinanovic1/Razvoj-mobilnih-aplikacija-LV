//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //FOR petlja

    for (i in 1..10) { // 1-10
        println(i)
    }
    for (i in 1 until 10) { // 1-9
        println(i)
    }
    for (i in 10 downTo 1) { //10-1
        println(i)
    }

    for (i in 1 until 10 step  2) { // definisati korak za iterator
        println(i)
    }
    val pets = arrayOf("dog", "cat", "canary")
    for (element in pets) {
        print(element + " ")
    }

    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element\n")
    }

    //WHILE PETLJA
    var i=0
    while (i <10){
        println(i)
        ++i
    }

    //DO WHILE

    var j=0
    do {
        println(j++)
    }
    while (j <=10 )

    repeat(2) {
        println("Pozdrav :)")
    }


}