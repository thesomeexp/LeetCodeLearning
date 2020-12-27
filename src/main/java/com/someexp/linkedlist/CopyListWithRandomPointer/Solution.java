package com.someexp.linkedlist.CopyListWithRandomPointer;

import java.util.HashMap;

/**
 * @author someexp
 * @date 2020/9/4
 */
public class Solution {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        // copy a list
        Node curr1 = head;
        Node head2 = new Node(-1);
        Node curr2 = head2;
        while (curr1 != null) {
            Node new_node = new Node(curr1.val);
            curr2.next = new_node;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        head2 = head2.next;

        // set the random
        curr2 = head2;
        curr1 = head;
        while (curr1 != null) {
            Node random = curr1.random;
            if (random == null) {
                curr2.random = null;
                curr1 = curr1.next;
                curr2 = curr2.next;
                continue;
            }
            Node random1 = head;
            Node random2 = head2;
            while (random1 != null && random1 != random) {
                random1 = random1.next;
                random2 = random2.next;
            }
            curr2.random = random2;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return head2;
    }


    public Node copyRandomList2(Node head) {
        if (head == null) {
            return head;
        }
        HashMap<Node,Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head,newHead);
        Node cur = newHead;
        while (head != null) {
            if (head.next != null) {
                if (!map.containsKey(head.next)) {
                    map.put(head.next,new Node(head.next.val));
                }
            }
            cur.next = map.get(head.next);
            if (head.random != null) {
                if (!map.containsKey(head.random)) {
                    map.put(head.random, new Node(head.random.val));
                }
                cur.random = map.get(head.random);
            }
            head = head.next;
            cur = cur.next;
        }
        return newHead;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
