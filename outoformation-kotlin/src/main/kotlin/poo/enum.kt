package poo
//Les classes enum ont des méthodes synthétiques permettant de lister les constant d'énumération définies ou d'obtenir
// une constante enum par son nom. Ils s'agit des méthodes valueOf(value: String) et values()
enum class Day(var iswekend:Boolean=false) {
    Lundi,Mardi,Mercredi,Jeudi,Vendredi,Samedi(true),Dimache(true);
}

fun main() {

    for(index in Day.values()){
        println("${index.ordinal}:${index.name} is wekend:${index.iswekend}")
    }
}