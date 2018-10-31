import java.util.*
import kotlin.math.abs

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> (y?.minus(x?: 1))?: abs(x?: 0) })
    return arrayList
}
