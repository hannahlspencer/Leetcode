class Leetcode383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var magazineHash = mutableMapOf<Char, Int>()
        for(letter in magazine) {
            if(magazineHash.containsKey(letter)) {
                val currentCount: Int = currentCount(letter, magazineHash)
                magazineHash.set(letter, currentCount + 1)
            } else {
                magazineHash.put(letter, 1)
            }

        }

        for(letter in ransomNote) {
            if(magazineHash!!.containsKey(letter)) {
                val currentCount = currentCount(letter, magazineHash)
                if(currentCount > 1) {
                    magazineHash.set(letter, currentCount - 1)
                } else {
                    magazineHash.remove(letter)
                }
            } else {
                return false
            }
        }
        return true
    }

    fun currentCount(letter: Char, magazineHash: Map<Char, Int>): Int {
        return magazineHash!!.get(letter) as Int
    }
}