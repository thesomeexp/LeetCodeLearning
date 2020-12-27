package com.someexp.arrays.SquareOfASortedArray;

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
public class Solution {
    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        int[] b = {-7,-3,2,3,11};
        int[] c = {-1};
        int[] res = new Solution().sortedSquares(c);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length-1) {
                System.out.print(",");
            }
        }
    }

    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        int pp = 0;
        int np = 0;
        while (pp < len && A[pp] < 0) {
            pp++;
        }
        np = pp - 1;
        int count = 0;
        while (np >= 0 && pp < len) {
            if (A[np] * A[np] < A[pp] * A[pp]) {
                result[count] = A[np] * A[np];
                np--;
            } else {
                result[count] = A[pp] * A[pp];
                pp++;
            }
            count++;
        }

        while (np >= 0) {
            result[count] = A[np] * A[np];
            np--;
            count++;
        }

        while (pp < len) {
            result[count] = A[pp] * A[pp];
            pp++;
            count++;
        }
        return result;
    }
}
