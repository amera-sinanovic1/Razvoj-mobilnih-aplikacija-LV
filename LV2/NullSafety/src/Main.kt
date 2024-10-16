//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //U Kotlinu varijable ne mogu biti null po default-u
   // val rijec:String = null //greska

    // dodajemo ? da definisemo varijablu koja moze poprimiti null vrijednost

    //var rijec:String? = null
    var rijec:String? = "Amera"
    //println(rijec.length) //greska
    rijec=null
    if (rijec!=null)
        println(rijec.length)
    else
        println("NPE")
    rijec="Amera"
    //kraci nacin
    println(rijec?.length)
    println(rijec!!.length)

    rijec=null
    println(rijec?.length) // vrati null
    //println(rijec!!.length) // throw NPE exception

    rijec="Amera"
    //ELVIS operator
    // ako je rijec=null ->text= Neki text
    // ako je rijec!=null ->text= rijec
    val text: String = rijec?: "Neki tekst"
    println(text)




}