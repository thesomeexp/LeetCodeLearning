package com.someexp.linkedlist.LinkedListCycle;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == -10000000) {
                return true;
            }
            head.val = -10000000;
            head = head.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
