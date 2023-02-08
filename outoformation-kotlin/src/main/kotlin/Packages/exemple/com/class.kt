package Packages.exemple.com

interface Operat{
    fun sum(n1:Int,n2:Int)
    fun div(n1:Double,n2:Double)
}
class Calcule:Operat{
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2)
    }

    override fun div(n1: Double, n2: Double) {
        println(n1/n2)
    }

}
class AA:Operat{
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2+1)
    }

    override fun div(n1: Double, n2: Double) {
        println(n1/n2+1)
    }

}