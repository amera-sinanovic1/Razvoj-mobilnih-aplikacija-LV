//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val instruments = listOf("trumpet", "piano", "violin")
    //instruments[O] = "drums"
    println(instruments)

    val myList = mutableListOf("trumpet", "piano", "violin")
    myList.remove("violin")
    myList[0] = "drums"
    println(myList)

}