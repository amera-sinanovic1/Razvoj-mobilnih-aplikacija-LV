//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    fun main() {
        val sum1= suma(3,4)
        println(sum1)
        val sum4= suma4(3,4)
        val sum2= suma4(3,4,5,6)
        println(sum2)
        val sup3=suma4(3,4,5)
        println(sup3)

    }

    fun suma (a: Int, b: Int): Int {
        //Funkcije počinju s ključnom riječi fun.
        // Argumenti funkcija zahtijevaju tipove i nepromjenljivi su.
        return a + b
    }

    fun suma4(a: Int, b: Int, c: Int = 0, d: Int = 0): Int {
        //Možemo dodijeliti default vrijednosti parametrima.
        // Parametar s default vrijednošću je opcionalan, jer se može uvijek pretpostaviti da
        // će se koristiti default vrijednost.
        return a + b + c + d
    }
}