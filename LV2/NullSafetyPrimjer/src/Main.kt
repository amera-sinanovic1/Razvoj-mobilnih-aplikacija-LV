//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Napiši funkciju koja uzima nadimak korisnika kao parametar (koje može biti null) i
// vraća broj karaktera u nadimku. Ako je nadimak null, vrati poruku "Ne postoji nadimak".
    val notNullText: String = "Definitely not null"
    val nullableText1: String? = "Might be null"
    val nullableText2: String? = null
    fun1(notNullText)
    fun2(notNullText)

    fun1(nullableText1)
    fun1(nullableText2)

    fun2(nullableText1)
    fun2(nullableText2)
}

fun fun1(text: String?) {
    if (text != null)
    println(text)
    else
    println("Nothing to print :(")
}

fun fun2(text: String?) {
    val toPrint = text ?: "Nothing to print :("
    println(toPrint)
}


