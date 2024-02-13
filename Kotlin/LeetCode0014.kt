class LeetCode0014 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) { return ""}
        strs.sort()
        var shortest = strs[0]
        for(str in strs) {
             while(str.indexOf(shortest) != 0) {
                 shortest = shortest.substring(0,shortest.length-1);
             }
            
        }
        return shortest
    }
}