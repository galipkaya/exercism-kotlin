object Bob {
    fun hey(input: String): String {
        if (input.trim() == "") return "Fine. Be that way!"
        if (input.isForcefulQuestion()) return "Calm down, I know what I'm doing!"
        if (input.isQuestion()) return "Sure."
        if (input.isShouting()) return "Whoa, chill out!"
        return "Whatever."
    }

    private fun String.isForcefulQuestion(): Boolean =
        this.isQuestion() && this.trim().dropLast(1).isShouting()

    private fun String.isShouting(): Boolean =
        this.none { it.isLowerCase() } && this.any { it.isLetter() }

    private fun String.isQuestion(): Boolean = this.trim().endsWith("?")
}
