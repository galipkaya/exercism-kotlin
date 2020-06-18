class DiamondPrinter {

    fun printToList(c: Char): List<String>? {

        if( c == 'A')
            return listOf<String>("A")

        var res = mutableListOf<String>()

        var preSpaceCount: Int = c-'A';
        var betweenSpaceCount: Int = -1;
        val space =" "

        for( currentChar in 'A'..c ){
            var str : String = ""
            // print leading spaces
            for(j in 1..preSpaceCount)
                str = str.plus(space)

            // insert letter
            str = str.plus(currentChar)
            for(j in 1..betweenSpaceCount)
                str = str.plus(space)
            if( betweenSpaceCount>0 )
                str = str.plus(currentChar)

            // print trailing spaces
            for(j in 1..preSpaceCount)
                str = str.plus(space)

            preSpaceCount--
            betweenSpaceCount+=2

            res.add(str)

        }

        return res + res.reversed().drop(1)
    }


}
