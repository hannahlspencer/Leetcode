class Leetcode0021 {

    class ListNode(var `val`: Int?) {
        var next: ListNode? = null
    }
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        // 21. Merge Two Sorted Lists
        var firstNode: ListNode? = ListNode(null)

        var first = list1
        var second = list2

        var current = firstNode

        while(first != null && second != null) {

            if(second!!.`val`!! < first!!.`val`!!) {
                current!!.next = second
                second = second!!.next
            } else {
                current!!.next = first
                first = first!!.next
            }
            current = current!!.next


        }
        if(first != null) {
            current!!.next = first
        }

        if(second != null) {
            current!!.next = second;
        }

        return firstNode!!.next
    }
}