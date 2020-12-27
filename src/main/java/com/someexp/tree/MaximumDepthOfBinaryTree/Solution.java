package com.someexp.tree.MaximumDepthOfBinaryTree;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDept = maxDepth(root.left);
        int rightDept = maxDepth(root.right);
        return leftDept > rightDept ? leftDept + 1 : rightDept + 1;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
