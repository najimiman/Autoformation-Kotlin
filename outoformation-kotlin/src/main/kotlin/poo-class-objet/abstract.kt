package poo

abstract class Animal{
    abstract var age:Int
    abstract fun A()
}
class Cat:Animal(){
    override var age: Int=12


    override fun A() {
        println("hello cat")
    }
}

fun main() {
    var cat1=Cat()
    println("age:"+cat1.age)
    cat1.A()
}