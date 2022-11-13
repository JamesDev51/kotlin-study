package week_12

import week_12.WeekDay.*

enum class WeekDay{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    val lowercaseName get() = name.lowercase()
    fun isWorkDay() = this==SATURDAY || this==SUNDAY

//    fun isWorkday() = this ==SATURDAY || this == SUNDAY

}
fun WeekDay.isWorkday() = this ==WeekDay.SATURDAY || this == WeekDay.SUNDAY


fun main() {
    println(WeekDay.MONDAY.isWorkday())

    println(WeekDay.SATURDAY.isWorkday())

    println(MONDAY.lowercaseName)
}