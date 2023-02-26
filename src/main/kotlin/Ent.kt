data class Ent(var fran:String,var ang:String) {
    init {
        if (fran.isEmpty() || fran.isBlank()) throw Exception("le mot français peut pas etre empty ou blank")
        if (ang.isEmpty() || ang.isBlank()) throw Exception("le mot anglais peut pas etre empty ou blank")
    }
    override fun toString(): String {
        return "$fran : $ang"
    }
    fun equals(other: Ent): Boolean {
        if (this.fran==other.fran)
            return true
        else return false
    }
}