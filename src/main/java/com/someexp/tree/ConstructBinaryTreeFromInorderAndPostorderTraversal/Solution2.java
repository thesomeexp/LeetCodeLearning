package com.someexp.tree.ConstructBinaryTreeFromInorderAndPostorderTraversal;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode root = new Solution2().buildTree(inorder, postorder);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart) {
        if (postStart < 0 || inStart < inEnd) return null;

        TreeNode root = new TreeNode(postorder[postStart]);

        int rIndex = -1; // root Index
        for (int i = inStart; i >= 0; i--) {
            if (inorder[i] == postorder[postStart]) {
                rIndex = i;
                break;
            }
        }

        root.right = buildTree(inorder, inStart, rIndex + 1, postorder, postStart - 1);
        root.left = buildTree(inorder, rIndex - 1, inEnd, postorder, postStart - (inStart - rIndex) - 1);
        return root;
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
