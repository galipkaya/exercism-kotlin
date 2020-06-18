class Squares(val n: Int) {

    fun sumOfSquares(): Int {
        return (1..n).fold(0){
            sum, element -> sum + element.square()
        }
    }

    fun squareOfSum(): Int {
        return (1..n).sum().square()
    }

    fun difference(): Int {
        return squareOfSum()-sumOfSquares()
    }
}

private fun Int.square(): Int {
    return this * this
}
