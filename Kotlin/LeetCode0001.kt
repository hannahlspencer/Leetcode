class LeetCode0001 {
    // 1. Two Sum
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var sumMap = HashMap<Int, Int>()
        for (i in 0..nums.size) {
            var remaining = target - nums[i]
            if (sumMap.contains(remaining)) {
                var first: Int = sumMap.get(remaining) ?: 0
                var second = i
                return intArrayOf(first, second)
            }
            sumMap.put(nums[i], i)
        }
        return intArrayOf()
    }
}