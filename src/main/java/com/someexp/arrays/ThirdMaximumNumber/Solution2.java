package com.someexp.arrays.ThirdMaximumNumber;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println(new Solution2().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        long min = (long)Integer.MIN_VALUE - 1;
        long max = min, max2 = min, max3 = min;
        for (int n : nums) {
            if (n > max) {
                max3 = max2;
                max2 = max;
                max = n;
            } else if (n > max2 && n < max) {
                max3 = max2;
                max2 = n;
            } else if (n > max3 && n < max2)
                max3 = n;
        }
        return max3 == min ? (int)max : (int)max3;
    }
}
