import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// 1. Napisati Kotlin skriptu koja ce pronaci sumu svih parnih brojeva od 1 do 100.

fun main() {
    var n = 100
    var result = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            result += i
            println(result)
        }
    }
    println(result)
}