object PigLatin {

    fun translate(phrase: String): String {

        val words = phrase.split(" ")
        var result = ""

        for( word in words ){
            var res = word
            val vovels = arrayOf('a', 'e', 'i', 'o', 'u')

            // rule 1
            if( word[0] in vovels || word.startsWith("xr") ||word.startsWith("yt")) {
                res = word + "ay"
            }
            else
            {
                // rule 3
                if( word[1]=='q' && word[2]=='u' ){
                    res = word.subSequence(3, word.length).toString() + word.subSequence(0,3).toString() + "ay"
                }
                else if( word[0]=='q' && word[1]=='u' ){
                    res = word.subSequence(2, word.length).toString() + "quay"
                }

                else{
                    // rule 2
                    while(res[0] !in vovels){
                        res = res.subSequence(1, res.length).toString()+res[0]
                        if( res[0]=='y' )
                            break
                    }
                    res += "ay"
                }
            }

            result += res
            if( words.size > 1 )
                result += " "
        }

        return result.trim()
    }
}
