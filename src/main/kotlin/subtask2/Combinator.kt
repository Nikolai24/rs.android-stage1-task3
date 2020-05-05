package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        if (m==n) return 1
        if (m==0) return null
        val f = factorial(n) / m
        for (x in 1..(n/2)) {
            if (f == factorial(x) * factorial(n-x)) {
                return x
            }
        }
        return null
    }

    fun factorial (a: Int): Long {
        var result = 1L
        for (i in 1..a) {
            result *= i
        }
        return result
    }
}

