package com.someexp.linkedlist.OddEvenLinkedList;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = null;
        if (head.next != null) {
            even = head.next;
        }
        ListNode even_head = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        if (even_head != null) {
            odd.next = even_head;
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
