package com.someexp.tree.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author someexp
 * @date 2020/9/7
 */
public class Solution {
    public static void main(String[] args) {
        Queue<TreeNode> queue = new LinkedList<>();
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode curr = queue.getFirst();
        queue.remove(0  );
        int thisLevelCount = 1;
        int nextLevelCount = 0;
        LinkedList<Integer> thisLevelList = new LinkedList<>();
        while (thisLevelCount > 0) {
            thisLevelList.add(curr.val);
            thisLevelCount--;
            if (curr.left != null) {
                queue.add(curr.left);
                nextLevelCount++;
            }
            if (curr.right != null) {
                queue.add(curr.right);
                nextLevelCount++;
            }
            if (!queue.isEmpty()) {
                curr = queue.getFirst();
                queue.remove(0  );
            }
            if (thisLevelCount == 0) {
                list.add(thisLevelList);
                thisLevelCount = nextLevelCount;
                thisLevelList = new LinkedList<>();
                nextLevelCount = 0;
            }
        }
        return list;
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
