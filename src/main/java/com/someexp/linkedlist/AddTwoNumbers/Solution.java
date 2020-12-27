package com.someexp.linkedlist.AddTwoNumbers;

/**
 * @author someexp
 * @date 2020/9/4
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode head = l1;
        ListNode curr = head;
        while (l1 != null || l2 != null) {
            curr.val = flag + l1.val + l2.val;
            if (curr.val >= 10) {
                flag = 1;
                curr.val = curr.val - 10;
            } else {
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && l2 == null) {
                if (flag == 1) {
                    curr.next = new ListNode(1);
                }
                break;
            }
            if (l1 == null) {
                curr.next = l2;
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                curr.next = l1;
                l2 = new ListNode(0);
            }
            curr = curr.next;
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
