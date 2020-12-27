package com.someexp.linkedlist.PalindromeLinkedList;

import javax.naming.PartialResultException;
import java.util.List;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(0);
        ListNode three = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = null;
        System.out.println(new Solution().isPalindrome2(one));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int count = 0;
        ListNode countList = head;
        while (countList != null) {
            count++;
            countList = countList.next;
        }
        int breakCount = -1;
        if (count%2 != 0) {
            breakCount = count/2;
            breakCount++;
        }
        ListNode curr = head.next;
        head.next = null;
        count = 2;
        while (curr != null) {
            if (count == breakCount) {
                curr = curr.next;
                breakCount = -1;
                continue;
            }
            if (curr.val == head.val) {
                // compare two lists
                ListNode new_list1 = head;
                ListNode new_list2 = curr;
                while (new_list1 != null && new_list2 != null) {
                    if (new_list1.val != new_list2.val) {
                        break;
                    }
                    new_list1 = new_list1.next;
                    new_list2 = new_list2.next;
                }
                if (new_list1 == null && new_list2 == null) {
                    return true;
                }
                ListNode new_head = curr;
                curr = curr.next;
                new_head.next = head;
            } else {
                ListNode new_head = curr;
                curr = curr.next;
                new_head.next = head;
                head = new_head;
            }
            count++;
        }
        return false;
    }

    /*
    看不懂的高级算法
     */
    public boolean isPalindrome2(ListNode head) {
        ListNode slow=head,fast=head,q=null,r=null;

        while(fast!=null && fast.next!=null) {
            r = q;
            q = slow;
            slow = slow.next;
            fast = fast.next.next;
            q.next = r;
        }

        if(fast!=null) {
            slow = slow.next;
        }

        while(slow != null) {
            if(slow.val != q.val) {
                return false;
            }
            slow = slow.next;
            q = q.next;
        }

        return true;
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