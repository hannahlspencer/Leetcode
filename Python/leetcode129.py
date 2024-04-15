# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def sumNumbers(self, root):
            def traverse(node, current_total):
                if not node:
                    return 0
                current_total = current_total * 10 + node.val
                if not node.left and not node.right:
                    return current_total
                return traverse(node.left, current_total) + traverse(node.right, current_total)
            
            return traverse(root, 0)


    