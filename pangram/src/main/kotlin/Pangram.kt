object Pangram {

    fun isPangram(input: String): Boolean {

        val arr = IntArray(26)

        for(ch: Char in input.toLowerCase()){
            if(!ch.isLetter())
                continue
            val index = ch.toInt()-97
            arr[index]++
        }

        for (i in arr){
            if(i==0)
                return false
        }
        return true
    }
}
