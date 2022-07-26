class Leetcode5 {
    fun longestPalindrome(s: String): String {
        var result = ""
        var resultLength = 0

        val sHalf = s.length / 2
        for(i in 0..s.length) {
            var left = i
            var right = i
            while(left >= 0 && right < s.length && s[left] == s[right]) {
                if((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1)
                    resultLength = right - left + 1
                }
                left -= 1
                right += 1
            }

            left = i
            right = i+1
            while(left >= 0 && right < s.length && s[left] == s[right]) {
                if((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1)
                    resultLength = right - left + 1
                }
                left -= 1
                right += 1
            }
        }
        return result
    }
}