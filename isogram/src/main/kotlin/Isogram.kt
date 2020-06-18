

object Isogram {

    fun isIsogram(input: String): Boolean {
        val charMap = mutableMapOf<Char, Int>()
        for (ch in input.toLowerCase()) {
            if (ch.isLetter()) {
                if (!charMap.containsKey(ch))
                    charMap[ch] = 1
                else
                    return false
            }
        }
        return true
    }
}
