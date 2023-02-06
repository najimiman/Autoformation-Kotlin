import java.util.Calendar
import java.util.Date
import java.time.LocalDate
import java.time.Period
import java.time.Year

fun main() {
    //ex1
    println("hello iman")
    print("Enter your Name ::>")
    var name:String= readLine()!!
    println(name)

    print("Enter your Age ::>")
    val age:Int= readLine()!!.toInt()
    println (age)

    print("Enter your Average  ::>")
    val avg:Double=readLine()!!.toDouble()
    println(avg)

    print("Enter your Title ::>")
    var title:String?= readLine()
    println(title)

    //ex2 convert data type
    var strInt:String="1234"
    var intStr:Int=strInt.toInt()
    var a:Int=1
    var k:Int=12
    var m:String="age"
    var reulta:String=k.toString()
    println(intStr+a)
    println(m+"="+reulta)*/
    //ex3 operation
    print("---------calcule--------")
    println("donner valeur de a")
    var a:Int= readLine()!!.toInt()
    println("valeur de a est:$a")
    println("donner valeur de b")
    var b:Int= readLine()!!.toInt()
    println("valeur de a est:$b")
    var c=a+b
    println("la somme est:$c")


}