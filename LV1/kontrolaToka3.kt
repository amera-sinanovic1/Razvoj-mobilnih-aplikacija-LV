//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //WHEN izraz
    val alarm= 7

    when(alarm){
        12-> println("Tacno je $alarm sati")
        10-> println("Tacno je $alarm sati")
        8-> println("Tacno je $alarm sati")
        7-> println("Tacno je $alarm sati")
        else -> println("Alarm ugasen.")
    }

    when(alarm){
        12,10,8,7-> println("Tacno je $alarm sati")
        else -> println("Alarm ugasen.")
    }
    // da li se alarm nalaxi u opsegu x..y

    when(alarm){
        12,10,8,7-> println("Tacno je $alarm sati")
        // in 1..10 -> println("Vrijeme je u opsegu od 1 do 10")

        // !in 1..10 -> println("Vrijeme je u opsegu od 1 do 10")
        else -> println("Alarm ugasen.")
    }

    val text = when{
        alarm <=10 -> "Alarm je usposegu 1:10"
        alarm==8 || alarm==7 -> "Alarm je 7 ili 8"
        else -> "Alarm je $alarm ."
    }
    println(text)

}
