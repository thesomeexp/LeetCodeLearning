package com.someexp.linkedlist.FlattenAMultilevelDoublyLinkedList;

/**
 * @author someexp
 * @date 2020/9/4
 */
public class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node curr = head;
        letsFlatten(curr);
        return head;
    }

    public Node letsFlatten(Node curr) {
        if (curr.child == null && curr.next == null) {
            return curr;
        }
        if (curr.child == null) {
            curr = curr.next;
            return letsFlatten(curr);
        }
        if (curr != null) {
            Node app = curr.next;
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
            Node res = letsFlatten(curr);
            if (res == null || app == null) {

            } else {
                res.next = app;
                app.prev = res;
            }
            return letsFlatten(res);
        }
        return null;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}
