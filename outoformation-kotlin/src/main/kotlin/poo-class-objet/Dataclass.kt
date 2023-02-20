package poo

data class Stagaire(val nom:String,val age:Int)

fun main() {
    var a=Stagaire("hamidi",19)
    var a2=Stagaire("hamidi",19)
    println(a.toString())
    println(a2.equals(a))
}