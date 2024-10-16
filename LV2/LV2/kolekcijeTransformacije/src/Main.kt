
fun main() {
 //MAP transformacija

    val numbers= setOf(1,2,3,4,5,7)
    print( numbers.map{ it*100})
    print( numbers.map{ if(it==3) it*100 else it*5})

    val numbersMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    // MAP transformaciju na mapi mozemo koristiti za kljuceve ili vrijednosti
    print(numbersMap.keys.map { it*10 }) //pomnozi kljuceve sa 10
    print(numbersMap.values.map {it.uppercase()  }) //transf. vrijednost u velika slova


 //ZIPPING
 //Poveyivanje leemnata iz dva seta na istim pozicijama
    val colors = listOf("red","green","blue")
    val animals= listOf("lion","cat", "dog")
    println(colors.zip(animals))
    //drugi nacin
    println(colors zip animals )

//STRING Representation
    val numbersStrings = listOf("one","two","three","four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val recenica = StringBuffer("LISTA BROJEVA JE; ")
    println(numbersStrings.joinTo(recenica))

}