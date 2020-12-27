package com.someexp.linkedlist.RotateList;

/**
 * @author someexp
 * @date 2020/9/4
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 0;
        ListNode curr = head;
        ListNode tail = null;
        while (curr != null) {
            len++;
            tail = curr;
            curr = curr.next;
        }
        int ro = k % len;
        if (ro == 0) {
            return head;
        }
        tail.next = head;
        int h = len - ro;
        for (int i = 1; i <= h; i++) {
            if (i == h) {
                ListNode pre = head;
                head = head.next;
                pre.next = null;
                break;
            }
            head = head.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
