package com.someexp.tree.SymmetricTree;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left.val != right.val) return false;
        boolean leftBool = isSymmetric(left.left, right.right);
        boolean rightBool = isSymmetric(left.right, right.left);
        if (leftBool && rightBool) return true;
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
