class Leetcode0002 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val first = convertToString(l1, "").toBigInteger()
        val second = convertToString(l2, "").toBigInteger()
        val intAnswer = first + second

        return stringToListNode(intAnswer.toString().reversed(), null)
    }

    fun convertToString(num: ListNode?, str: String) : String{
        val strNum = str + (num?.`val`).toString()

        if(num?.next?.`val` != null) {
            return convertToString(num?.next, strNum)
        }
        return strNum.reversed()
    }

    fun stringToListNode(num: String, node: ListNode?) : ListNode? {
        val digit = num.last().toString()
        val newNode = ListNode(digit.toInt())
        newNode.next = node
        val remaining = num.dropLast(1)

        if(remaining != "") {
            return stringToListNode(remaining, newNode)
        }
        return newNode
    }
}