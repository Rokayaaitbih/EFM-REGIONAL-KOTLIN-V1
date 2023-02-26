class Dictionnaire {
    var entrées:MutableList<Ent> = mutableListOf()

    fun nombresEntrées():Int{
        return entrées.size
    }

    fun ajouter(e:Ent){
        if (entrées.contains(e)){
            throw Exception("already exist")
        }else entrées.add(e)
    }

    fun supprimer(e:Ent):Boolean{
        if(entrées.contains(e)) {
            entrées.remove(e)
            return true
        }else {
            throw Exception("doesn't exist")
            return false
        }
    }

    fun supprimer(motEnglish:String):Boolean{
        var etat:Boolean=false
        for (entre in entrées){
            if (entre.ang==motEnglish){
                entrées.remove(entre)
                etat=true
            }else {
                throw Exception("doesn't exist")
                etat=false
            } }
        return etat
    }

    fun frAn(motFrench:String): MutableList<String> {
        val motsAnglais = mutableListOf<String>()
        for (entree in entrées) {
            if (entree.fran == motFrench) {
                motsAnglais.add(entree.ang)
            }
        }
        return motsAnglais
    }

    fun motsFrançais(): Set<String> {
        return entrées.map { it.fran }.toSet()
    }

    fun dictionnaireFrAn():HashMap<String,ArrayList<String>>{
        val dictionnaire = HashMap<String, ArrayList<String>>()
        for (entree in entrées) {
            val motsAnglais = dictionnaire.getOrDefault(entree.fran, ArrayList())
            motsAnglais.add(entree.ang)
            dictionnaire[entree.fran] = motsAnglais
        }
        return dictionnaire
    }
    override fun toString():String{
        val str = StringBuilder()
        for (entree in entrées) {
            str.append(entree.toString())
            str.append("\n")
        }
        return str.toString()
    }
}