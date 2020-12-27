package com.someexp.arrays.ValidMountainArray;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
//        int[] A = {2,1};
//        int[] A = {3,5,5};
//        int[] A = {3,3,2};
//        int[] A = {0,3,2,1};
        int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        System.out.println(new Solution().validMountainArray(A));
    }

    public boolean validMountainArray(int[] A) {
        if (A.length < 2) {
            return false;
        }
        int top = 0;
        int top_index = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]) {
                return false;
            }
            if (A[i] < A[i-1]) {
                top = A[i - 1];
                top_index = i - 1;
                break;
            }
        }
        if (top == 0) {
            return false;
        }
        if (A[0] >= top) {
            return false;
        }
        for (int j = top_index + 1; j < A.length; j++) {
            if (A[j] > A[j-1] || A[j] == A[j-1]) {
                return false;
            }
        }
        if (A[A.length - 1] >= top) {
            return false;
        }
        return true;
    }
}
