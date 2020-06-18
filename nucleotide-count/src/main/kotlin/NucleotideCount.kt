class Dna(val input: String) {

    init {
        require(input.all { "ACGT".contains(it) })
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val result = mutableMapOf<Char, Int>('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
            input.forEach {
                result[it] = result.getOrDefault(it, 0).plus(1)
            }
            return result
        }
}
