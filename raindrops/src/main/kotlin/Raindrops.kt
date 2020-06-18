object Raindrops {

    fun convert(n: Int): String {
        var str : String = ""
        if( n%3==0 )
            str = "Pling"
        if( n%5==0 )
            str += "Plang"
        if( n%7==0)
            str += "Plong"
        if( n%3!=0 && n%5!=0 && n%7!=0 )
            str = n.toString()
        return str
    }
}
