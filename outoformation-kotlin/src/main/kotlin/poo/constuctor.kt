package poo

class Car{
    var Nom:String?=null
    var Color:String?=null
    var A:Int?=null
    var B:Double?=null

    //constructor parametere
    constructor(nom:String,color:String,a:Int,b:Double) {
        println("nom:$nom")
        this.Nom=nom
        println("color:$color")
        this.Color=color
        println("A:$a")
        this.A=a
        println("B:$b")
        this.B=b
    }
    //constructor default
    constructor(){
        this.Nom="car2"
        this.Color="red"
        this.A=300
        this.B=10.0
    }
    fun calcule():Double{
    return this.A!!-(this.B!!.toDouble()*10)
    }
}

fun main() {
    var car1=Car("car1","red",200,10.0)
    println("calcule:"+car1.calcule())
    var car2=Car()
    println("car2:"+car2.calcule())
    //var car2=Car("car1","red")
}