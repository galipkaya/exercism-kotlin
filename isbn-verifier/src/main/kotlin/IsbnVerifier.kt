class IsbnVerifier {

    fun isValid(number: String): Boolean {
        if( number.contains('X') && number.last() !='X' )
            return false

        val newNumber = number.replace("-", "")
        if( newNumber.length != 10 )
            return false

        var coef = 10
        return newNumber.split("")
            .filter{ it!="" && (it[0].isDigit() || it[0]=='X') }
            .fold(0){
                    total, item -> total+(item.toNewInt()*(coef--))
            } % 11 == 0
    }
}

private fun String.toNewInt(): Int =
    if( this[0] == 'X' )
        10
    else
        this.toInt()
