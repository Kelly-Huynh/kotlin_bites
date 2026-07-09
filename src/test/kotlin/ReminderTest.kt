import kotlin.test.Test
import org.example.Reminder
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ReminderTest {
    @Test
    fun testReminderReturnsNameAndTask() {
        val reminder = Reminder("Leo")
        reminder.remindMeTo("Walk the dog")

        assertEquals(reminder.remind(), "Walk the dog, Leo!")
    }

    @Test
    fun testReminderDoesNotAcceptEmptyString() {
        val reminder = Reminder("Ju")
        reminder.remindMeTo("")

        assertEquals(reminder.remind(), "")
    }
}