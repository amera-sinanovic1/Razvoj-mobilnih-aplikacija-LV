//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 //Operatori u Kotlinu
 //Linijski komentar
 /* Blok komentar */
    val x = 5
    val y = 4 // val y = 4.0

    println("x+y = ${x+y}") // string template izrazi
    println("x-y = ${x-y}")
    println("x*y = ${x*y}")
    println("x/y = ${x/y}")
    println("x*y = ${x*y}")
    println("x%y = ${x+y}")

    println(" 2+5*4 = ${2+5*4 }")
    println(" (2+5)*4 = ${(2+5)*4 }")

    var result= x+y
    result= result+5 // result+=5
    println(result)

    result=result-1 //// result-=1
    println(result)

    //inkrement
    println(result) // rez=13
    println(result++) // rez = 13 (ispisi pa inkrmentiraj)
    println(++result) // rey = 15 (inkrementiraj pa ispisi)

    //dekrement
    result=5
    println(result) // rez=5
    println(result--) // rez = 5 (ispisi pa inkrmentiraj)
    println(--result) // rey = 3 (inkrementiraj pa ispisi)


}