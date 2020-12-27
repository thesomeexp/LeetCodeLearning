package com.someexp.arrays.DuplicateZeros;

/**
 * @author someexp
 * @date 2020/9/1
 */
/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.



Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]



Note:

    1 <= arr.length <= 10000
    0 <= arr[i] <= 9

 */
public class Solution {
    public static void main(String[] args) {
//        int[] arr = {1,0,2,3,0,4,5,0};
        int[] arr = {0,1,7,6,0,2,0,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
        new Solution().duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(",");
            }
        }
    }
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int tail = arr.length - 1;
        int point = tail - 1;
        while (point >= 0) {
            if (arr[point] == 0) {
                // shift to the right
                while (tail - 1 > point) {
                    arr[tail] = arr[tail - 1];
                    tail--;
                }
                // reset tail
                tail = len - 1;
                // insert zero
                arr[point + 1] = 0;
            } else {

            }
            point--;
        }
    }
}
