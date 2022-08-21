class Leetcode0709 {

    fun kotlinInbuiltToLowerCase(s: String): String {
        return s.toLowerCase()
    }

    val lower = listOf<Char>('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val upper = listOf<Char>('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

    fun actualToLowerCase(s: String): String {
        val regex = "^[A-Z]*$".toRegex()
        var result = ""
        for(letter in s) {
            if(regex.matches(letter.toString())) {
                val index = upper.indexOf(letter)
                result += lower[index]
            } else {
                result += letter
            }
        }
        return result
    }
}