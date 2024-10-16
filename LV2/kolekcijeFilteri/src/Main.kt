//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // filter metod
    // Uslov filtera u zagradama{} provjerava svaki element liste.
    // Ako izraz u zagradama vrati true, taj element se uključuje.

    //filter
    val lista= mutableListOf(" tamno zeleno", "svijetlo zeleno", "zeleno","plavo")
    val filterList=  lista.filter { it== "zeleno" }
    filterList.forEach { println(it) }
    val lista2 = listOf(4,5,7,-5,12)
    lista2.filter { it > 5 }.forEach { println(it) }

    val lista3 = listOf("aa", "bb", "ab", "abcd")
    lista3.filter { it[0] == 'a' }.forEach { println(it) }

    val mapa = mutableMapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 100" to 110)
    mapa.forEach { println(it) }
    val filterMap = mapa.filter { it.key.endsWith("1") || it.value > 100 }
    println(filterMap)

}