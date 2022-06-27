class Leetcode20 {
    fun isValid(s: String): Boolean {
        val bracketStack = mutableListOf<Char>()
        val leftBrackets = listOf<Char>('(', '{', '[')
        val rightBrackets = listOf<Char>(')', '}', ']')
        for(bracket in s) {
            if(leftBrackets.contains(bracket)) {
                bracketStack.add(bracket)
                continue
            }
            val bracketIndex = rightBrackets.indexOf(bracket)
            val matchingBracket = leftBrackets.get(bracketIndex)
            if(bracketStack.isEmpty() || bracketStack.last() != matchingBracket) {
                return false
            }
            bracketStack.removeAt(bracketStack.size - 1)
        }
        if(!bracketStack.isEmpty()) {
            return false
        }
        return true
    }
}