package com.someexp.tree.ConstructBinaryTreeFromPreorderAndInorderTraversal;

/**
 * @author someexp
 * @date 2020/9/8
 */
public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd) {
        if (preStart > preorder.length || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int rIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preStart]) {
                rIndex = i;
                break;
            }
        }

        root.left = buildTree(preorder, preStart + 1, inorder, inStart, rIndex - 1);
        root.right = buildTree(preorder, preStart + (rIndex - inStart) + 1, inorder, rIndex + 1, inEnd); // rIndex - inStart 是左数的长度
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
