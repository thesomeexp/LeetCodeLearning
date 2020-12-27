package com.someexp.arrays.MoveZeroes;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int zero_point = 0;
        int point = 0;
        while (point < len) {
            while (zero_point < len && nums[zero_point] != 0) {
                zero_point++;
            }
            if (point > zero_point && nums[point] != 0) {
                // swap
                int temp = nums[point];
                nums[point] = nums[zero_point];
                nums[zero_point] = temp;
            }
            point++;
        }
    }
}
