class Leetcode0890 {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val result = mutableListOf<String>()
        for(word in words) {
            if(checkPattern(word, pattern)) {
                result.add(word)
            }
        }
        return result
    }

    fun checkPattern(word: String, pattern: String): Boolean {
        for(i in 0..word.length - 1) {
            if (word.indexOf(word.get(i)) != pattern.indexOf(pattern.get(i))) {
                return false
            }
        }
        return true
    }
}