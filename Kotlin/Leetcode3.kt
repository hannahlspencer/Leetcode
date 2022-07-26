class Leetcode3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var subStr = ""
        var longest = 0
        for(char in s) {
            subStr += char.toString()
            if(areCharactersUnique(subStr)) {
                if(longest < subStr.length){
                    longest = subStr.length
                }
            } else {
                subStr = subStr.drop(1)
            }
        }
        return longest
    }

    fun areCharactersUnique(subStr: String): Boolean {
        val substrSet = subStr.toSet()
        return substrSet.size == subStr.length
    }
}