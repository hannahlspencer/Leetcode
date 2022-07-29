class Leetcode0053 {
    fun maxSubArray(nums: IntArray): Int {
        var maxSub = nums[0]
        var currentSum = 0

        for(number in nums) {
            if(currentSum < 0) {
                currentSum = 0
            }
            currentSum += number
            maxSub = maxOf(maxSub, currentSum)
        }
        return maxSub
    }
}