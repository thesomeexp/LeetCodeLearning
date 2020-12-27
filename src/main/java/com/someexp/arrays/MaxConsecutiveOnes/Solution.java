package com.someexp.arrays.MaxConsecutiveOnes;

/**
 * @author someexp
 * @date 2020/9/1
 */
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

Note:

    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000
 */
public class Solution {

    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1};
//        System.out.println(a.length);
        new Solution().findMaxConsecutiveOnes(a);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            }
            if (nums[i] == 1) {
                count ++;
                if (count > max) {
                    max = count;
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
