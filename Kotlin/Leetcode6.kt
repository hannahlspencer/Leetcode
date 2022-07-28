class Leetcode6 {
    fun convert(s: String, numRows: Int): String {
        if(numRows == 1) {
            return s
        }
        val rows = mutableListOf<String>()
        for(i in 0..numRows-1) {
            rows.add("")
        }
        var row = 0
        var up = true

        for(char in s) {
            val soFar = rows.getOrNull(row)
            rows.set(row, soFar + char)

            if(up && row < numRows-1) {
                row++
            } else if(up && row == numRows-1) {
                up = false
                row--
            } else if(!up && row > 0) {
                row--
            } else if(!up && row == 0) {
                up = true
                row++
            }
        }
        return rows.joinToString("")
    }
}