package function/*fun Ajouter(){
    var nom= Array<String>(3){""}
    for(i in 0..2){
        print("entre nom de promotion")
        //nom[i]= readLine()!!.toString()
        nom[i] = readLine()!!.toString()
    }
    for(name in nom){
        println(name)
    }
}*/
/*fun affiche(vararg names:String){

    for(name in names){
        println(name)
    }
}*/
fun main() {
    //var nom= Array<String>(3){""}
    val myList = mutableListOf<String>()
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
                for(name in myList){
                    println(name)

                }
                println(myList)
            }
            2->{
                println("------ajouter------")
                //Ajouter()
                /*for(i in 0..2){
                    print("entre nom de promotion")
                    //nom[i]= readLine()!!.toString()
                    nom[i] = readLine()!!.toString()
                }*/
                print("entre nom de apprenant")
                var nom:String= readLine()!!.toString()
                //myList.add(nom)
                print("entre prenom de apprenant")
                var prenom:String= readLine()!!.toString()
                myList.add(prenom+" "+nom)
            }
            3->{
                println("------supprimer------")
                println("entre nom supprimer ")
                var nomremove:String= readLine()!!.toString()
                /*val arraytwo=nom.drop(1)
                for(name in arraytwo){
                    println(name)
                }*/

                myList.remove(nomremove)
                println(myList)
            }
            4->{
                break
            }
        }
    }


    /*print("entre nombre de promotion")
    var nombre:Int= readLine()!!.toInt()
    var nom:Array<String> = Array(nombre){""}
    for(i in 0..nombre-1){
        print("entre nom de promotion")
        nom[i]= readLine()!!.toString()

    }
    for(i in 0 until nombre){
        println("Pet $i:  ${nom[i]}")
    }
*/

}