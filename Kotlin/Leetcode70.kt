class Leetcode70 {
    fun climbStairs(n: Int): Int {
        if(n == 1 || n == 2) {
            return n
        }

        var a = 1
        var b = 2
        var c = 0

        for(i in 3..n) {
            c = a + b
            a = b
            b = c
        }

        return c
    }
}