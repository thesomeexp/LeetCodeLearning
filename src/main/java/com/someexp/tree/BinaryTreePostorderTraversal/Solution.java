package com.someexp.tree.BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author someexp
 * @date 2020/9/7
 */

/*
    原谅我, 树的后序遍历不用递归真的太难理解了...
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode curr, List<Integer> list) {
        if (curr == null) return;
        postorder(curr.left, list);
        postorder(curr.right, list);
        list.add(curr.val);
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
