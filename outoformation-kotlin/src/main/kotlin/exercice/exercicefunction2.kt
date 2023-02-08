val myList = mutableListOf<String>()
fun Ajouter(){
    print("entre nom de apprenant")
    var nom:String= readLine()!!.toString()
    //myList.add(nom)
    print("entre prenom de apprenant")
    var prenom:String= readLine()!!.toString()
    myList.add(prenom+" "+nom)
}
fun affiche(){
    for(name in myList){
        println(name)
    }
    println(myList)
}
fun supprimer(){
    println("entre nom supprimer ")
    var nomremove:String= readLine()!!.toString()
    /*val arraytwo=nom.drop(1)
    for(name in arraytwo){
        println(name)
    }*/
    myList.remove(nomremove)
    println(myList)
}
fun main() {
    while (true){
        println("1-affiche")
        println("2-ajouter")
        println("3-supprimer")
        println("4-break")
        println("nombre menu")
        var nbmenu:Int= readLine()!!.toInt()
        when(nbmenu){
            1->{
                println("------affiche------")
                affiche()
            }
            2->{
                println("------ajouter------")
                Ajouter()
            }
            3->{
                println("------supprimer------")
               supprimer()
            }
            4->{
                break
            }
        }
    }
}