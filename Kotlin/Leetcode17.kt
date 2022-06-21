class Leetcode17 {
    //17. Letter Combinations of a Phone Number
    fun letterCombinations(digits: String): List<String> {
        var result = mutableListOf<String>()
        val size = digits.length
        for(num in 0..size - 1) {
            var letters = getLetters(digits.get(num))
            if(result.isEmpty()) {
                for(letter in letters) {
                    result.add(letter)
                }
            } else {
                val resultSize = result.size
                val temp = mutableListOf<String>()
                for(num in result) {
                    for(letter in letters) {
                        temp.add(num + letter)
                    }
                }
                result = temp
            }

        }
        return result
    }

    fun getLetters(digit: Char): List<String> {
        when(digit) {
            '2' -> return listOf("a", "b", "c")
            '3' -> return listOf("d", "e", "f")
            '4' -> return listOf("g", "h", "i")
            '5' -> return listOf("j", "k", "l")
            '6' -> return listOf("m", "n", "o")
            '7' -> return listOf("p", "q", "r", "s")
            '8' -> return listOf("t", "u", "v")
            '9' -> return listOf("w", "x", "y", "z")
            else -> return listOf("Error")
        }
    }
}