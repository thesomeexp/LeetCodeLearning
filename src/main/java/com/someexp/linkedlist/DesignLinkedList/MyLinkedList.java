package com.someexp.linkedlist.DesignLinkedList;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class MyLinkedList {

    Node head;

    int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index + 1 > length || index < 0) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node new_node = new Node();
        new_node.val = val;
        new_node.next = head;
        this.head = new_node;
        this.length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node new_node = new Node();
        new_node.val = val;
        new_node.next = null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
        this.length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > length || index < 0) {
            return;
        }
        if (index == 0) {
            this.addAtHead(val);
            return;
        }
        if (index == length) {
            this.addAtTail(val);
            return;
        }
        Node new_node = new Node();
        new_node.val = val;
        Node prev = null;
        Node curr = head;
        int count = 0;
        while (count < index) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        new_node.next = prev.next;
        prev.next = new_node;
        this.length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= this.length || index < 0) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            this.length--;
            return;
        }
        Node prev = null;
        Node curr = this.head;
        int count = 0;
        while (count < index) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = curr.next;
        this.length--;
    }

    class Node {
        int val;
        Node next;
    }

    @Override
    public String toString() {
        Node curr = this.head;
        String str = "";
        while (curr != null) {
            str = str + curr.val + "->";
            curr = curr.next;
        }
        if ("".equals(str)) {
            return "is empty";
        }
        return str;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */