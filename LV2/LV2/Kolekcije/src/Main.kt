
fun main() {
    //LISTE
    // Liste su uređena kolekcija elemenata.
    //Dozvoljavaju ponovljene vrednosti.
    //Svi elementi u listi kada deklarirane sa tipom, moraju imati isti tip.
    val intList: List<Int> = listOf(1, 2, 3)
    val doubleList: List<Double> = listOf(1.1, 2.2, 3.3)
    val stringList = mutableListOf("Mujo", "Suljo", "Haso")

    val recenica = "Danas je lijep i suncan dan."
    recenica.split(" ") //metoda vraća listu tipa List<String>

    stringList.add("Pero")
    //stringList.forEach { println(it) }
    for (i in stringList)
        println(i)

    stringList.remove("Pero")
    println("For each:")
    stringList.forEach { println(it) }

    //LISTE
    //Set je neuređena kolekcija jedinstvenih elemenata.
    //Ne dozvoljava ponavljanje elemenata.
    //Koristi se kada vam je potrebna kolekcija bez duplikata.

    val set1 = mutableSetOf("User 1", "User 2", "User 3")
    set1.forEach { println(it) }
    set1.add("User 4")
    set1.forEach { println(it) }
    set1.add("User 1")
    set1.forEach { println(it) }

    //MAPE
    //Mapa je kolekcija parova ključ-vrijednost.
    //Svaki ključ je jedinstven, ali vrijednosti mogu biti iste.
    val users= mutableMapOf< Int, String>(1 to "Amera",2 to "Haso", 3 to "Pero")
    users.forEach {t,u -> println("$t, $u")}

    users[5]= "Anica"
    users.remove(1)
    users.forEach {t,u -> println("$t, $u")}



}