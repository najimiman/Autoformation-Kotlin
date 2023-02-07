package poo

open class Operation(){
    fun sum(a:Int,b:Int):Int{
        return  a+b
    }
    open fun div(a:Int,b:Int):Int{
        return  a/b
    }
}
class Muloperation():Operation(){
    fun sum1(a:Int,b:Int):Int{
        return  a+b
    }
    fun div1(a:Int,b:Int):Int{
        return  a/b
    }
    override fun div(a:Int,b:Int):Int{
        super.div(a, b)
        return  a/b+2
    }
}
fun main(){
    var a=Operation()
    println(a.sum(1,3))
    println(a.div(4,2))
    var b=Muloperation() as Operation
    //println(b.sum1(5,5))
    //println(b.div1(10,2))
    println(b.div(10,2))

}