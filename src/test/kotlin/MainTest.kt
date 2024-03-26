import org.example.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `Test calc` () {
        val calc = Calculator()

        val res = calc.add(1, 1)

        assertEquals(2, res)
    }
}