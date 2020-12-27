package com.someexp.arrays.FindNumbersWithEvenNumberOfDigits;

/**
 * @author someexp
 * @date 2020/9/1
 */
/*
Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.



Constraints:

    1 <= nums.length <= 500
    1 <= nums[i] <= 10^5
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = {12,345,2,6,7896};
        int[] b = {555,901,482,1771};
        int[] c = {437,315,322,431,686,264,442};
        new Solution().findNumbers(c);
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        int numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; nums[i] > 0; j++) {
                nums[i] = nums[i]/10;
                numCount++;
            }
            if (numCount % 2 == 0) {
                count++;
            }
            numCount = 0;
        }
        System.out.println(count);
        return count;
    }
}
