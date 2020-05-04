package subtask1

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isEmpty()) {
            return (null)
        }
        var n = numbers.size - 1
        var s = ""
        var c: String
        var k = 1
        for (element in numbers) {
            c = ""
            if (n == numbers.size - 1) {
                c = "$element"
            }  else {
                if (element > 0) {
                    c = " + $element"
                }
                else {
                    if (element < 0) {
                        k = element * -1
                        if (k == 1) {
                            c = " - "
                        } else {
                            c = " - $k"
                        }
                    }
                }
            }
            if ((n > 1) && (element != 0)) {
                c += "x^$n"
            }
            if ((n == 1) && (element != 0)) {
                c += "x"
            }
            s += c
            n--
        }
        return (s)
    }
}
