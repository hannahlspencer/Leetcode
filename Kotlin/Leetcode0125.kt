    fun isPalindrome(s: String): Boolean {
        if(s.length <= 1) {
            return true
        }

        val regular = s.filter { it.isLetterOrDigit() }.toLowerCase()
        val reversed = regular.reversed()
        return reversed == regular
    }