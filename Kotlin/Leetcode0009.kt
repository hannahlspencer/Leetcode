class Leetcode0009 {
    fun isPalindrome(x: Int): Boolean {
        val number = Integer.toString(x)
        var answer = true
        val length = number.length
        for(i in 0..length / 2) {
            if((number[i]) != number[(length - 1) - i]) {
                answer = false
            }
        }
        return answer
    }
}