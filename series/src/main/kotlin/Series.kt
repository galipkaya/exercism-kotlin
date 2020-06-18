object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        require(n<=s.length)

        return s.split("").mapNotNull {
            if(it!="")
                it.toInt()
            else
                null
        }.windowed(n)

    }
}
