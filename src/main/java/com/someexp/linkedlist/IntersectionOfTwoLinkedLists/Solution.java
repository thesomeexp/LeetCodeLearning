package com.someexp.linkedlist.IntersectionOfTwoLinkedLists;

import java.util.List;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = headA;
        ListNode b1 = headB;
        if (a1 == null || b1 == null) {
            return null;
        }
        while (a1.next != null && b1.next != null) {
            a1 = a1.next;
            b1 = b1.next;
        }
        ListNode a2 = headA;
        ListNode b2 = headB;
        while (a1.next != null || b1.next != null) {
            if (a1.next != null) {
                a1 = a1.next;
                headA = headA.next;
            }
            if (b1.next != null) {
                b1 = b1.next;
                headB = headB.next;
            }
        }
        while (headA.next != null && headB.next != null) {
            if (headA == headB) {
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == headB) {
            return headA;
        } else {
            return null;
        }

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
