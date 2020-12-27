package com.someexp.linkedlist.RemoveNthNodeFromEndOfList;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode pre_slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            pre_slow = pre_slow.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        pre_slow.next = pre_slow.next.next;
        return head;
    }

    class ListNode {
        int val;
        Solution.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
