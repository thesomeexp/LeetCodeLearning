package com.someexp.arrays.ThirdMaximumNumber;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {3, 2};
//        int[] nums = {3,2,1};
        int[] nums = {1,2,2,5,3,5};
        System.out.println(new Solution().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        int len = nums.length;
        int[] max = new int[3];
        int max_tail = 0;
        for (int i = 0; i < len; i++) {
            if (max_tail == 0) {
                max[0] = nums[i];
                max_tail++;
                continue;
            }
            if (max_tail == 1) {
                if (nums[i] == max[0]) {
                    continue;
                }
                if (nums[i] > max[0]) {
                    max[1] = max[0];
                    max[0] = nums[i];
                } else {
                    max[1] = nums[i];
                }
                max_tail++;
                continue;
            }
            if (max_tail == 2) {
                if (max[0] == nums[i] || max[1] == nums[i]) {
                    continue;
                }
                if (nums[i] > max[0]) {
                    max[2] = max[1];
                    max[1] = max[0];
                    max[0] = nums[i];
                    max_tail++;
                    continue;
                }
                if (nums[i] > max[1]) {
                    max[2] = max[1];
                    max[1] = nums[i];
                    max_tail++;
                    continue;
                }
                max[2] = nums[i];
                max_tail++;
                continue;
            }
            if (nums[i] < max[2]) {
                continue;
            }
            boolean isExist = false;
            for (int j = 0; j < 3; j++) {
                if (max[j] == nums[i]) {
                    isExist = true;
                }
            }
            if (isExist) {
                continue;
            }
            if (nums[i] > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = nums[i];
                continue;
            }
            if (nums[i] > max[1]) {
                max[2] = max[1];
                max[1] = nums[i];
                continue;
            }
            if (nums[i] > max[2]) {
                max[2] = nums[i];
                continue;
            }
        }
        if (max_tail == 1 || max_tail == 2) {
            return max[0];
        }
        return max[2];
    }

}
