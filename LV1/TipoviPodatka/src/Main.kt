import java.security.KeyStore.TrustedCertificateEntry

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Integer
val ImeStudenta: String = "Amera"
val Godine: Int= 29

//val ImeStudenta = "Amera"
//val Godine= 29

println("$ImeStudenta ima $Godine godina")

var broj = 10
val max=Int.MAX_VALUE
val min= Int.MIN_VALUE
println("integer max value: $max") // max vrijednost koja moze biti spremljena u INT
    println("integer min value: $min")  // min vrijednost koja moze biti spremljena u INT
//broj= 225999999999
//println("integer broj: $broj") // ERROR: Kotlin: Assignment type mismatch: actual type is 'kotlin/Long' but 'kotlin/Int' was expected

// Byte

val broj2: Byte= 20 // Byte= 200??
val byteMax= Byte.MAX_VALUE
val byteMin= Byte.MIN_VALUE
println("byteMax value: $byteMax")
println("byteMin value: $byteMin")

//short
val broj3: Short= 30 // Short= 35000
val shortmax= Short.MAX_VALUE
val shortMin= Short.MIN_VALUE
println("shortmax value: $shortmax")
println("shortmin value: $shortMin")

// Long

val broj4: Long= 30 //225999999999
val longMax= Long.MAX_VALUE
val longMin= Long.MIN_VALUE
println("longMax value: $longMax")
println("longMin value: $longMin")

val number= 25    // preci pokazivacem misa preko val number: Int
//val number: Long= 25
//val number= 25L

// FLOAT i DOUBLE
val mojBroj= 2.5 // double
val mojBroj2= 2.5F   // float
//val mojBroj3: Float = 3.5 // sta ce se desiti?

println("prvi broj je> $mojBroj ")
println("prvi broj broj2 $mojBroj2")

//CHAR
 val karakter:Char = 'A' // val karakter = 'A'
 println(karakter)
 println("$karakter")

//BOOLEAN

val boolVarijabla: Boolean= true
val BoolVarijabla2 = false
println("$boolVarijabla")
println(BoolVarijabla2)



}