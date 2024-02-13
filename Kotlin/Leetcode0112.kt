class Leetcode0112 {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) return false
        if(root?.left == null && root?.right == null) {
            return if (root!!.`val` == targetSum) true else false
        }

        return hasPathSum(root?.left, targetSum - root!!.`val`) || hasPathSum(root?.right, targetSum - root!!.`val`)
    }
}