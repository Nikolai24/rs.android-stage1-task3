package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val newArray = itemsFromArray.filterIsInstance<Int>().toTypedArray().sortedArray()
        if (newArray.isEmpty()) {
            return 0
        }
        var n = numberOfItems
        if (numberOfItems > newArray.size) {
            n = newArray.size
        }
        var s = newArray.size - 1
        var result = 1
        var c = 0
        for (i in 1 .. n) {
            if (i > n) {
                return result
            }
            if ((n-i > 0) && (newArray[c]*newArray[c+1] > newArray[s]*newArray[s-1])) {
                result *= newArray[c] * newArray[c+1]
                n--
                c++
            } else {
                result *=  newArray[s]
                s--
            }
        }
        return result
    }
}
