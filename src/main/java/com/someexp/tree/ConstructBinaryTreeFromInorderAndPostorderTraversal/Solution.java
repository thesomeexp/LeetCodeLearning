package com.someexp.tree.ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.HashMap;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, postorder.length);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int postLen) {
        if (inorder.length == 0) return null;
        if (inorder.length == 1) {
            TreeNode newOne = new TreeNode(inorder[0]);
            return newOne;
        }
        // looking for root
        int root = -1;
        boolean isFind = false;
        for (int i = postLen - 1; i >= 0; i--) {
            if (isFind) break;
            for (int j = 0; j < inorder.length; j++) {
                if (isFind) break;
                if (inorder[j] == postorder[i]) {
                    root = j;
                    isFind = true;
                    postLen = i + 1;
                }
            }
        }
        TreeNode rootTreeNode = new TreeNode(inorder[root], null, null);
        int[] leftArray = new int[root];
        int[] rightArray = new int[inorder.length - root - 1];
        for (int i = 0; i < root; i++) {
            leftArray[i] = inorder[i];
        }
        if (rightArray.length > 0) {
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = inorder[root + i + 1];
            }
        }
        TreeNode leftNode = buildTree(leftArray, postorder, postLen);
        TreeNode rightNode = buildTree(rightArray, postorder, postLen);
        rootTreeNode.left = leftNode;
        rootTreeNode.right = rightNode;
        return rootTreeNode;
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
