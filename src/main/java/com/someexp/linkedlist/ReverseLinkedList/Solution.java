package com.someexp.linkedlist.ReverseLinkedList;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode new_head = curr.next;
            curr.next = new_head.next;
            new_head.next = head;
            head = new_head;
        }
        return head;
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
