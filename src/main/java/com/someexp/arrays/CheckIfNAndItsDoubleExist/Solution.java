package com.someexp.arrays.CheckIfNAndItsDoubleExist;

/**
 * @author someexp
 * @date 2020/9/2
 */
/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]



Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

Example 3:

Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.

 */
public class Solution {
    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {7,1,14,11};
        int[] arr = {3,1,7,11};
        System.out.println(new Solution().checkIfExist(arr));
    }

    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        int tail = len - 1;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
