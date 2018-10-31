class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(value: MyDate) = value in start .. endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first .. last
}
