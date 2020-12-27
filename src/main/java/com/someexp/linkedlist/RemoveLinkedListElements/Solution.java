package com.someexp.linkedlist.RemoveLinkedListElements;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode pre_point = null;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                if (curr == head) {
                    head = head.next;
                } else {
                    pre_point.next = curr.next;
                }
                curr = curr.next;
            } else {
                pre_point = curr;
                curr = curr.next;
            }
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
