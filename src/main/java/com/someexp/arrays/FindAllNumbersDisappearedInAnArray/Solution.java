package com.someexp.arrays.FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> integers = new Solution().findDisappearedNumbers(nums);
        System.out.println(integers);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - 1]++;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] == 0) {
                integers.add(j + 1);
            }
        }
        return integers;
    }
}
