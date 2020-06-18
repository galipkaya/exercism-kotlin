class Anagram(val param: String) {
    val word = param.toLowerCase()

    fun match(anagrams: Collection<String>): Set<String> {

        val wordMap = word.groupingBy { it }.eachCount()

        return anagrams.filter { anagram ->
            anagram.toLowerCase().groupingBy { it }.eachCount() == wordMap &&
                    anagram.toLowerCase() != word
        }.toSet()

    }
}
