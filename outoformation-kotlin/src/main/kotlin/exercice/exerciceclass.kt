package exercice
var mylist1=ArrayList<String>()
interface Todo{
    fun Ajouter()
    fun Supprimer()
    fun Afficher()
}
class  Todolist: Todo {
    override fun Ajouter() {
        println("entre votre nom")
        var nom= readLine().toString()
        println("entre votre prenom")
        var prenom= readLine().toString()
        mylist1.add(nom+" "+prenom)
    }

    override fun Supprimer() {
        println("entre votre nom")
        var nom= readLine().toString()
        mylist1.remove(nom)
    }
    override fun Afficher() {
        if(mylist1.size==0){
            println("list vide")
        }else{
            for (index in mylist1){
                println(index)
            }
        }
    }
}
fun main() {
    while (true){
        println("1-affiche")
        println("2-ajouter")
        println("3-supprimer")
        println("4-break")
        println("nombre menu")
        var nbmenu:Int= readLine()!!.toInt()
        var abclass= Todolist()
        when(nbmenu){
            1->{
                println("------affiche------")
                abclass.Afficher()
            }
            2->{
                println("------ajouter------")
                abclass.Ajouter()
            }
            3->{
                println("------supprimer------")
                abclass.Supprimer()
            }
            4->{
                break
            }
        }
    }
}
