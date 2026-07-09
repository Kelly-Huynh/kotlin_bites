package org.example

class Reminder(name: String) {
    var name = name
    var reminder = ""

    fun remindMeTo(newReminder: String) {
        reminder = newReminder
    }

    fun remind(): String {
        if (reminder.isEmpty()) {
            return reminder
        }
        return ("$reminder, $name!")
    }
}