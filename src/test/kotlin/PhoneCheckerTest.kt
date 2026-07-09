import org.example.PhoneChecker
import kotlin.test.Test

class PhoneCheckerTest {
    @Test
    fun testValidPhoneNumberReturnsTrue() {
        val phoneChecker = PhoneChecker()

        assert(phoneChecker.isPhoneValid("07000000000") == true)
        // refactored: assert(phoneChecker.isPhoneValid("07000000000"))
    }

    @Test
    fun testValidPhoneNumberReturnsFalse() {
        val phoneChecker = PhoneChecker()

        assert(phoneChecker.isPhoneValid(" ") == false)
        // refactored: assert(!phoneChecker.isPhoneValid(" "))
    }
}