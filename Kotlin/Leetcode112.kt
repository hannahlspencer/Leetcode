class Leetcode112 {
    // 112. Path Sum
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) return false
        if(root?.left == null && root?.right == null) {
            return if (root!!.`val` == targetSum) true else false
        }

        return hasPathSum(root?.left, targetSum - root!!.`val`) || hasPathSum(root?.right, targetSum - root!!.`val`)
    }
}