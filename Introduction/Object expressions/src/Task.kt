import java.util.*
import kotlin.math.abs

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int?, o2: Int?): Int {
            return (o2?.minus(o1?: 1))?: abs(o1?: 0)
        }

    })
    return arrayList
}
