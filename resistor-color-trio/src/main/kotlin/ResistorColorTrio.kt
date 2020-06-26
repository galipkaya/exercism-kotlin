object ResistorColorTrio {

    val colorMap = mapOf<Color, Char>(
        Color.BLACK  to '0',
        Color.BROWN  to '1',
        Color.RED    to '2',
        Color.ORANGE to '3',
        Color.YELLOW to '4',
        Color.GREEN  to '5',
        Color.BLUE   to '6',
        Color.VIOLET to '7',
        Color.GREY   to '8',
        Color.WHITE  to '9'
    )

    fun text(vararg input: Color): String {
        val lastColor: Color = input.last()
        val inputList = input.dropLast(1)

        val result = inputList.map{ color -> colorMap[color]}.joinToString(separator = "")

        return when (lastColor){
            Color.BLACK -> "$result ohms"
            Color.BROWN -> "${result}0 ohms"
            Color.RED -> "${result}00 ohms"
            Color.ORANGE -> "$result kiloohms"
            Color.YELLOW -> "${result}0 kiloohms"
            Color.GREEN -> "${result}00 kiloohms"
            Color.BLUE -> "$result megaohms"
            Color.VIOLET -> "${result}0 megaohms"
            Color.GREY -> "${result}00 megaohms"
            Color.WHITE -> "$result gigaohms"
        }.replace("000 ", " kilo")
    }
}
