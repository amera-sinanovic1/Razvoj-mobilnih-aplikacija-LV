fun main() {
//Varijable
 // Kotlin je Statically typed - prilikom kompaliranja se provjeravaju tipovi

 // var - mutable (moguca promjena vrijednosti varijable)
 var imeStudenta: String = "Amera" // Variable 'imeStudenta' initializer is redundant

 //var imeStudenta = "Amera"
 imeStudenta = "Merima"
 //imeStudenta = 100 // Moze li se int konvertovati u String??
 println(imeStudenta)
 println("Hello $imeStudenta.")

 // val - immutable (nije moguca promjena vrijednosti varijable)
 val prezimeStudenta: String = "Sinanovic"
 //prezimeStudenta = "Drugo prezim" //Error Kotlin: Val cannot be reassigned

 var ocjena: Int
 ocjena=10
 //ocjena= "x"
 println("var ocjena = $ocjena")

 val ocjena2: Int
 ocjena2= 6
 println("val ocjena = $ocjena2")

}
