class Leetcode128 {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size == 1) {
            return 1
        }
        if(nums.size == 0) {
            return 0
        }
        val sortedNums: IntArray = nums
        sortedNums.sort()
        var count = 1
        var maxCount = 1


        for(i in 1..sortedNums.size - 1) {

            if(nums[i-1] + 1 == nums[i]) {
                count++
            } else if (nums[i-1] == nums[i]) {
                continue
            } else {
                count = 1
            }
            if(count > maxCount) {
                maxCount = count
            }
        }

        return maxCount
    }
}