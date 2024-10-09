//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //NOT operator ! - za negaciju logickog izraza
    val isACtive= true
    if (isACtive) { //   if (!isACtive)
        println("Komponenta je aktivna")
    }
    else
        println("Komponenta je neaktivna")

    // AND operator && - kada vise uslova treba biti ispunjeno
    val rez= 54
    if ( (isACtive==true) && (rez>=50) ) {
       println("Student je polozio predmet")
    }
    else
        println("Student nije polozio predmet")

    // OR operator || / kada jedan ili vise log. izraza treba biti ispunjeno

    val br1=10 // val br1=-10
    val br2 = -5
    if (br1>0 || br2>0)
        print("Jedan od brojeva je pozitivan")
    else
        println("Oba broja su negativna")

    val text = if (br1>0 || br2>0){
        println("Jedan od brojeva je pozitivan")
        "Izraz tacan."}
    else{
        println("Oba broja su negativna")
        "Izraz netacan"}
    println(text)
}