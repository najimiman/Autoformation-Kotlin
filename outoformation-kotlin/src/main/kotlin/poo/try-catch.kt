package poo

fun main() {
    var a=10
    var b=0
    var c=a/b
    try {
        println(c)
    }
    catch (ex:Exception){
        println(ex.message)
    }



}