import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(time: LocalDateTime) {

    constructor(date: LocalDate) : this(date.atStartOfDay())

    val date: LocalDateTime = time.plusSeconds(1E9.toLong())
}
