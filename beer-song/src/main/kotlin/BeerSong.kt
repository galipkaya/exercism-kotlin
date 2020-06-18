object BeerSong {
    fun verses(startBottles: Int, takeDown: Int) : String{
        var res : String = ""
        if( startBottles==takeDown && startBottles != 0 ){
            return getString(startBottles)
        }
        for( i in startBottles downTo takeDown ){
            if( i==0 )
                break
            res += getString(i)+"\n"
        }
        if( takeDown==0 ){
            res += "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
        }

        return res.trimEnd()+"\n"
    }

    fun getString(start: Int): String{
        if( start==0 ){
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
        }
        val next = start-1

        val bottle = if (start>1)"$start bottles" else "$start bottle"
        val nextBottle = if (next>1)"$next bottles" else "$next bottle"
        val secondLine =
            if(next==0)
                "Take it down and pass it around, no more bottles of beer on the wall."
            else
                "Take one down and pass it around, $nextBottle of beer on the wall."

        return "$bottle of beer on the wall, $bottle of beer.\n$secondLine\n"
    }
}
