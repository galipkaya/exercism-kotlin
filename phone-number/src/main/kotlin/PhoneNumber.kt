class PhoneNumber(input: String) {

    val result: String

    init {
        var tmp = input
            .filter {
                it.isDigit()
            }
        require(tmp.length in 10..11)

        if (tmp.length == 11)
            require(tmp[0] == '1')

        tmp = tmp.takeLast(10)
        require(
            tmp[0] != '0' && tmp[0] != '1' &&
                    tmp[3] != '0' && tmp[3] != '1'
        )
        result = tmp
    }

    val number: String? = result

}
