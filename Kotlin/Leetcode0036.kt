    var input: Array<CharArray> = arrayOf(charArrayOf('5','3','.','5','7','.','.', '.','.'),charArrayOf('6','.','.','1','9','5','.','.','.'),charArrayOf('.','9','8','.','.','.','.','6','.'),charArrayOf('8','.','.','.','6','.','.','.','3'),charArrayOf('4','.','.','8','.','3','.','.','1'),charArrayOf('7','.','.','.','2','.','.','.','6'),charArrayOf('.','6','.','.','.','.','2','8','.'),charArrayOf('.','.','.','4','1','9','.','.','5'),charArrayOf('.','.','.','.','8','.','.','7','9'))

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        //check rows, columns, & boxes




        return checkRows(board) && checkColumns(board)
    }

    fun checkColumns(board: Array<CharArray>): Boolean {
        val rowLength = board[0].size
        for(col in 0 until rowLength) {
            var column = mutableListOf<Char>()
            for(row in 0 until rowLength) {
                val value = board[row][col]
                if(column.contains(value)) { return false }
                if(value != '.') { column.add(value) }
            }
        }
        return true
    }

    fun checkRows(board: Array<CharArray>): Boolean {
        for(row in board) {
            val numbers = row.filter { it != '.'}
            val duplicates = numbers.groupingBy { it }.eachCount().filter { it.value > 1 }
            if(duplicates.isNotEmpty()) return false
        }
        return true
    }

    fun main() {
        isValidSudoku(input)
    }


