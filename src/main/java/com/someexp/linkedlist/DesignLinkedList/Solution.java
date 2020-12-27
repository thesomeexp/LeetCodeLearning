package com.someexp.linkedlist.DesignLinkedList;

import java.util.LinkedList;

/**
 * @author someexp
 * @date 2020/9/3
 */
public class Solution {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList);
    }
}
