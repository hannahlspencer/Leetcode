class LeetCode2108 {
    fun firstPalindrome(words: Array<String>): String {
        for(word in words) {
            val reversed = word.reversed()
            if(reversed == word) {
                return word
            }
        }
        return ""
    }
}