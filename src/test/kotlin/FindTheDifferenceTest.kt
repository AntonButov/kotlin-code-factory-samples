import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindTheDifferenceTest {

    private val findTheDifferece: FindTheDifference = FindTheDifferenceImpl()

    @Test
    fun firstCase() {
        val first = "abcd"
        val secon = "abcde"
        assertEquals("e", findTheDifferece.getDifference(first, secon))
    }

    @Test
    fun secondCase() {
        val first = ""
        val secon = "y"
        assertEquals("y", findTheDifferece.getDifference(first, secon))
    }
}