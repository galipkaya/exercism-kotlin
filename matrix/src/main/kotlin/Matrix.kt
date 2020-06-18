class Matrix(private val matrixAsString: String) {

    val resultMatrix: List<List<Int>> =
        matrixAsString.split("\n")
            .map { row ->
                row.trim()
                    .split(Regex("\\s+"))
                    .map(String::toInt)
            }

    fun column(colNr: Int): List<Int> = resultMatrix.map { it[colNr - 1] }

    fun row(rowNr: Int): List<Int> = resultMatrix[rowNr - 1]
}
