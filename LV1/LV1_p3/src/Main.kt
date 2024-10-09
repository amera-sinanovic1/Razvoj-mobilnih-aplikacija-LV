//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Za bilo koji trocifren broj provjeriti je li palindrom.

fun main(args: Array<String>) {

    val broj=343
    if ( broj <0)
        println("Broj $broj nije palindrom")
    else {
        val c1: Int = broj/100
        println(c1)
        val c2: Int = (broj%100) /10
        println(c2)
        val c3: Int = (broj%100) % 10
       println(c3)
        if (c1==c3)
            println("Broj $broj je palindrom")
        else
            println("Broj $broj nije palindrom")
    }


}