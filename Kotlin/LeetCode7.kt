class LeetCode7 {
    // 7. Reverse Integer
    fun reverse(x: Int): Int {
        var result = x.toString()
        var negative = false

        if(x == 0) {
            return 0
        }
        if(result.get(0) == '-') {
            negative = true
            result = result.drop(1)
            println("Minus " + result)
        }

        result = result.reversed()
        while(result.get(0) == '0') {
            result = result.drop(1)
        }
        if(minus) {
            result = '-' + result
        }
        try {
            return result.toInt()
        } catch(e: NumberFormatException) {
            return 0
        }
    }
}