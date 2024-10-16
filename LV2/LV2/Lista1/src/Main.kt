//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   // Liste su uređena kolekcija elemenata.
    //Dozvoljavaju ponovljene vrednosti.
    //Svi elementi u listi kada deklarirane sa tipom, moraju imati isti tip.
    val intList: List<Int> = listOf(1, 2, 3)
    val doubleList: List<Double> = listOf(1.1, 2.2, 3.3)
    val stringList: List<String> = listOf("Faris", "Amila", "Mujo")

    val recenica = "Danas je lijep i suncan dan."
    recenica.split() //metoda vraća listu tipa List<String>

    //List<Any> može sadržati elemente različitih tipova
    List<List<Int>> (ugniježdene liste) omogućava rad sa dvodimenzionalnim kolekcijama

}