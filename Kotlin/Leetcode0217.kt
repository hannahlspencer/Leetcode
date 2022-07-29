class Leetcode0217 {
    // 217. Contains Duplicate
    fun containsDuplicate(nums: IntArray): Boolean {
        val setOfArray = nums.toSet()
        return nums.size != setOfArray.size
    }
}