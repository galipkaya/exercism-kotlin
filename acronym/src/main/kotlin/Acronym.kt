object Acronym {
    fun generate(phrase: String) : String {
        return phrase
            .replace('_', ' ')
            .replace('-',' ')
            .split(" ")
            .mapNotNull {
                if(it.isNotEmpty())
                    it[0].toUpperCase()
                else
                    null
            }
            .joinToString("")
    }
}
