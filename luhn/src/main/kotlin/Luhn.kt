object Luhn {

    fun isValid(candidate: String): Boolean =
        candidate
            .replace(" ", "")
            .mapIndexed { index, c ->
                if (!c.isDigit())
                    return false
                val res = if (index % 2 == 0)
                    (c-'0') * 2
                else
                    (c-'0')
                if(res>9)
                    res-9
                else
                    res
            }
            .sum() % 10 == 0
}
