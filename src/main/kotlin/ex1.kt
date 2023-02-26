
fun String.isEmptyOrBlank(){
    if (isEmpty()){ println("is empty") }
    if(isBlank()) { println("is blank") }
}

fun String.acronym(): String {
    val mots= this.split(" ").filter { it.isNotBlank() }
    val acronym = StringBuilder()
    for (mot in mots) {
        acronym.append(mot[0].toUpperCase())
    }
    return acronym.toString()
}

