class Leetcode2351 {
    fun repeatedCharacter(s: String): Char {
        val letterSet = mutableSetOf<Char>()
        for(letter in s) {
            if(letterSet.contains(letter)) {
                return letter
            } else {
                letterSet.add(letter)
            }
        }
        return 'a'
    }
}