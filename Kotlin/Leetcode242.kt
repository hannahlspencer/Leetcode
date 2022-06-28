class Leetcode242 {
    // 242. Valid Anagram
    fun isAnagram(s: String, t: String): Boolean {
        return sortString(s) == sortString(t)
    }

    fun sortString(str: String): String {
        val chars = str.toCharArray()
        chars.sort()
        return String(chars)
    }
}