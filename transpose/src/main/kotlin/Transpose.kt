object Transpose {

    fun transpose(input: List<String>): List<String> {
        var currentChar = 0

        val result = mutableListOf<String>()

        while (true){
            var newLine = ""
            var finished = true;
            for( lineIndex in input.indices ){
                val line = input[lineIndex]
                if( currentChar<line.length ) {
                    newLine = newLine.plus(line[currentChar])
                    finished = false
                }else {
                    // check if rest has chars to print
                    var i= lineIndex+1
                    while( i<input.size ){
                        if( i>=input.size )
                            break
                        if( currentChar<input[i].length ){
                            newLine = newLine.plus(" ")
                            break;
                        }
                        i++
                    }
                }
            }
            if( finished )
                break;
            result.add(newLine)
            currentChar++
        }
        return result;
    }
}
