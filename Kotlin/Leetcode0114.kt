class Leetcode0114 {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
    fun flatten(root: TreeNode?): Unit {
        if(root == null || (root.left == null && root.right == null)) {
            return;
        }

        if(root.left != null) {
            flatten(root.left)
            val temp = root.right
            root.right = root.left
            root.left = null

            var current = root.right
            while(current!!.right != null) {
                current = current.right
            }
            current.right = temp
        }
        flatten(root.right)
    }
}