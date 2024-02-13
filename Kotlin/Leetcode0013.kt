class Leetcode0013 {
    fun romanToInt(s: String): Int {
        var result = 0
        var start = s
        while(start.length > 0) {
            if(start.length == 1) {
                result += romanValue(start[0]);
                start = "";
                break;
            }
            val x = romanValue(start[0]);
            val y = romanValue(start[1]);
            if(x < y) {
                result += (y - x);
                start = start.substring(2, start.length);
            } else {
                result += x;
                start = start.substring(1, start.length);
            }
        }
        return result
    }

    fun romanValue(value: Char): Int {
        if(value == 'M') {
            return 1000
        }
        if(value == 'D') {
            return 500
        }
        if(value == 'C') {
            return 100
        }
        if(value == 'L') {
            return 50
        }
        if(value == 'X') {
            return 10
        }
        if(value == 'V') {
            return 5
        }
        if(value == 'I') {
            return 1
        }
        return 0
    }
}