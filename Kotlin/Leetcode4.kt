class Leetcode4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val first = mergeArrays(nums1, nums2)
        return findArrMedian(first)
    }


    fun mergeArrays(nums1: IntArray, nums2: IntArray) : IntArray {
        var i = 0
        var j = 0
        var result = mutableListOf<Int>()
        val totalSize = nums1.size + nums2.size
        while(result.size < totalSize) {
            var first = 0
            var second = 0
            if(i == nums1.size) {
                first = Int.MAX_VALUE
            } else{
                first = nums1[i]
            }

            if(j == nums2.size) {
                second = Int.MAX_VALUE
            } else {
                second = nums2[j]
            }

            if(first < second) {
                result.add(nums1[i])
                i++;
            } else {
                result.add(nums2[j])
                j++
            }
        }
        return result.toIntArray()

    }


    fun findArrMedian(arr: IntArray): Double {
        if(arr.size == 0) {
            return 0.0
        }
        if(arr.size == 1) {
            return arr[0].toDouble()
        }
        var halfSize = 0

        if(arr.size % 2 == 1) {
            halfSize = arr.size / 2
            return arr[halfSize].toDouble()
        } else {
            halfSize = arr.size / 2
            return (arr[halfSize] + arr[halfSize -1]).toDouble() / 2
        }
    }
}