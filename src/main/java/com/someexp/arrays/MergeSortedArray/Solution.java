package com.someexp.arrays.MergeSortedArray;

/**
 * @author someexp
 * @date 2020/9/1
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 0, n = 1;
//        int[] nums1 = {1,0};
//        int[] nums2 = {2};
//        int m = 1, n = 1;
        new Solution().merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
            if (i != nums1.length - 1) {
                System.out.print(",");
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int tail = len - 1;
        int point1 = 0;
        int point2 = 0;
        while (point2 < n) {
            while (point1 < m && point2 < n && nums1[point1] <= nums2[point2]) {
                point1++;
            }
            // shift to right include point1
            while (tail > point1) {
                if (tail - 1 == point1) {
                    nums1[tail] = nums1[point1];
                } else {
                    nums1[tail] = nums1[tail - 1];
                }
                tail--;
            }
            // reset tail
            tail = len - 1;
            // insert
            nums1[point1] = nums2[point2];
            point2++;
            m++;
        }
    }
}
