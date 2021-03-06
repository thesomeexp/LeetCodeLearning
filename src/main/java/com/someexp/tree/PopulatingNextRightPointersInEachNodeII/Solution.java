package com.someexp.tree.PopulatingNextRightPointersInEachNodeII;

/**
 * @author someexp
 * @date 2020/9/8
 */
/*
思路和上面一样的, 但是上面那题完全二叉树呢就有更好的方案, 我想这里也会有更好的方案吧
 */
public class Solution {
    public Node connect(Node root) {
        Node[] nodes = new Node[100];
        root = connect(root, 1, nodes);
        return root;
    }

    public Node connect(Node root, int level, Node[] nodes) {
        if (root == null) return null;
        root.next = nodes[level];
        nodes[level] = root;
        connect(root.right, level + 1, nodes);
        connect(root.left, level + 1, nodes);
        return root;
    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
