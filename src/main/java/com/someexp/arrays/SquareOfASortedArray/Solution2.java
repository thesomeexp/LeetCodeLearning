package com.someexp.arrays.SquareOfASortedArray;

import com.someexp.arrays.utils.QuickSort;

/**
 * @author someexp
 * @date 2020/9/1
 */
/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:

    1 <= A.length <= 10000
    -10000 <= A[i] <= 10000
    A is sorted in non-decreasing order.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        int[] b = {-7,-3,2,3,11};
        new Solution2().sortedSquares(b);
    }

    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        result = new QuickSort().sort(A, 0, A.length-1);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        return result;
    }
}
