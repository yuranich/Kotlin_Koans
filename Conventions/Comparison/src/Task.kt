data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val yDiff = year - other.year
        if (yDiff != 0) return yDiff
        val mDiff = month - other.month
        if (mDiff != 0) return mDiff
        return dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
