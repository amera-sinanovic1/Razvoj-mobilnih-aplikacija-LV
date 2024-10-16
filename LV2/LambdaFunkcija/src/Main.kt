//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Lambda funkcije su funkcije koje nemaju ime,
// a mogu se zapisati direktno unutar varijabli ili funkcija.
    add(3,4)

    // Kako zapisati funkciju add preko lambda funkcije??

    val myLambda= {a:Int ,b:Int ->  println("a+b=${a+b}")}
    myLambda(8,5)
    //Funkcije viseg reda
    //napisati funkciju add1 koja uzima lambda izraz ako parametar
    add1(4,{a:Int ->  println("a+a=${a+a}")})

}

fun add(a: Int, b: Int)  {
    println("a+b=${a+b}")
}

fun add1(a: Int, funkcija: (Int)->Unit)  {
    funkcija(a)
}

