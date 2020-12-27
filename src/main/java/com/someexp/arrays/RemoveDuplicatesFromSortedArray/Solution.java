package com.someexp.arrays.RemoveDuplicatesFromSortedArray;

/**
 * @author someexp
 * @date 2020/9/2
 */
/*
  Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.

 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {1,1,2};
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1};
        int len = new Solution().removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
            if (i != len - 1) {
                System.out.print(",");
            }
        }
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int tail = len - 1;
        int point = 0;
        int cho;
        while (point < tail) {
            cho = point + 1;
            while (cho <= tail) {
                if (nums[point] == nums[cho]) {
                    // del nums[cho]
                    int temp = cho;
                    while (temp < tail) {
                        nums[temp] = nums[temp + 1];
                        temp++;
                    }
                    tail--;
                } else {
                    cho++;
                }
            }
            point++;
        }
        return tail + 1;
    }
}
