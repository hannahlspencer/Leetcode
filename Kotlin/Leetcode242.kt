class Leetcode242 {
    // 242. Valid Anagram
    // This solution, while feels very clean, isn't actually great for time - it's O(n log n)
    fun isAnagram(s: String, t: String): Boolean {
        return sortString(s) == sortString(t)
    }

    fun sortString(str: String): String {
        val chars = str.toCharArray()
        chars.sort()
        return String(chars)
    }


    // Below is an O(n) solution

    fun isNAnagram(s: String, t: String): Boolean {
        val firstMap = mutableMapOf<Char, Int>()
        val secondMap = mutableMapOf<Char, Int>()

        for(letter in s) {
            if(firstMap.contains(letter)) {
                val currentValue = firstMap.get(letter) !!
                firstMap.set(letter, currentValue + 1)
            } else {
                firstMap.put(letter, 1)
            }
        }

        for(letter in t) {
            if(secondMap.contains(letter)) {
                val currentValue = secondMap.get(letter) !!
                secondMap.set(letter, currentValue + 1)
            } else {
                secondMap.put(letter, 1)
            }
        }
        return firstMap == secondMap
    }

}