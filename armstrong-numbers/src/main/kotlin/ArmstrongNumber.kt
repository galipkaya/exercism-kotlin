import javax.xml.stream.events.Characters
import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val strNum = input.toString()
        val power= strNum.length
        val res = input.toString().fold(0){ sum, digit ->
            println("d: $digit, s:$sum")
            sum+Character.getNumericValue(digit).toFloat().pow(power).toInt()
        }
        return res == input
    }

}
