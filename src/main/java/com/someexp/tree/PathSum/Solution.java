package com.someexp.tree.PathSum;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        boolean res = isExist(root, 0, sum);
        return res;
    }

    private boolean isExist(TreeNode root, int val, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && sum == val + root.val) {
            return true;
        }
        boolean leftBool = isExist(root.left, val + root.val, sum);
        boolean rightBool = isExist(root.right, val + root.val, sum);
        if (leftBool || rightBool)
            return true;
        else return false;
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
