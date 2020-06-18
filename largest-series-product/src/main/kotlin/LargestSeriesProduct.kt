class Series(val input: String) {

    init {
        input.forEach { require(it.isDigit()) }
    }

    fun getLargestProduct(span: Int): Long {

        if (span == 0)
            return 1

        require(span > 0 && input.isNotEmpty() && span<=input.length)

        var max = 0L
        for (i in 0 .. (input.length - span)) {
            max = maxOf(input.product(i, span), max)
        }
        return max
    }
}

private fun String.product(startIndex: Int, span: Int): Long {
    var result = 1L
    for (i in 0 until span) {
        result *= (this[startIndex + i] - '0')
    }
    return result
}
