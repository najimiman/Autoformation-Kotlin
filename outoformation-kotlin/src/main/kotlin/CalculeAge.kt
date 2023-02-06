import java.time.LocalDate
import java.time.Period
import java.util.Calendar

fun main(){
    /*var a=Calendar.getInstance().get(Calendar.YEAR)
    println("entre votre year naisssance")
    var b:Int= readLine()!!.toInt()
    var c:Int=a-b
    println("votre age est:$c")*/

    print("Enter your year of birth :")
    val birthYear: Int = readLine()!!.trim().toInt()

    print("Enter your month of birth :")
    val birthMonth: Int = readLine()!!.trim().toInt()

    print("Enter your day of birth :")
    val birthDay: Int = readLine()!!.trim().toInt()

    val ld: LocalDate
    ld = LocalDate.of(birthYear, birthMonth, birthDay)
    println(LocalDate.now())
    val p: Period
    p = Period.between(ld, LocalDate.now())


    println("Your age is ${p.years} years " +
            ", ${p.months} months" +
            ", and ${p.days} days ")
}