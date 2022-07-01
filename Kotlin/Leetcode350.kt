class Leetcode350 {
    // 350. Intersection of Two Arrays II
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val first = hashMapOf<Int, Int>()

        val result = mutableListOf<Int>()
        for(num in nums1) {
            if(first.contains(num)) {
                val currentVal = first.get(num) !!
                first.set(num, currentVal + 1)
            } else {
                first.put(num, 1)
            }
        }

        for(num in nums2) {
            if(first.contains(num)) {
                val currentValue = first.get(num) !!
                if(currentValue == 1) {
                    first.remove(num)
                } else {
                    first.set(num, currentValue - 1)
                }
                result.add(num)
            }
        }
        return result.toIntArray()
    }
}