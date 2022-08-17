class Leetcode0804 {
    val letters = listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")
    val morseLetters = listOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val representations = mutableSetOf<String>()
        for(word in words) {
            representations.add(transformToMorse(word))
        }
        return representations.size
    }

    fun transformToMorse(word: String): String {
        var result = ""
        for(letter in word) {
            val index = letters.indexOf(letter.toString())
            result += morseLetters[index]
        }
        return result
    }
}