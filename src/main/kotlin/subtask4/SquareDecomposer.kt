package subtask4

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5) {
        return null
        }
        return decompose(number*number, number-1)
    }

    private fun decompose(v: Int, n: Int): Array<Int>?{
            for (i in n downTo 1) {
            val r = v-i*i
            when {
                r == 0 -> return arrayOf(i)
                r < 0 -> return null
            }
            val next = sqrt(r.toDouble()).toInt()
            val nextVal = if(next >= i) decompose(r, i - 1) else decompose(r, next)
            if (!nextVal.isNullOrEmpty()) return nextVal + arrayOf(i)
        }
        return null
    }
}
