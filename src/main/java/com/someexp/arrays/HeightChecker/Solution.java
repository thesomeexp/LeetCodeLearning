package com.someexp.arrays.HeightChecker;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
//        int[] heights = {1,1,4,2,1,3};
//        int[] heights = {5,1,2,3,4};
        int[] heights = {2,1,2,1,1,2,2,1};
        new Solution().heightChecker(heights);
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i]);
            if (i != heights.length - 1) {
                System.out.print(",");
            }
        }
    }

    public int heightChecker(int[] heights) {
        int[] count = new int[heights.length];
        int sum = 0;
        int min_pointer = 0;
        int pointer = 0;
        int min_min_pointer = 0;
        while (min_pointer < heights.length) {
            pointer = heights.length - 1;
            min_min_pointer = min_pointer;
            while (pointer > min_pointer) {
                if ((heights[pointer] < heights[min_pointer]) && (heights[pointer] < heights[min_min_pointer])) {
                    min_min_pointer = pointer;
                }
                pointer--;
            }

            if (min_min_pointer < heights.length && min_min_pointer > min_pointer && heights[min_min_pointer] < heights[min_pointer]) {
                count[min_pointer]++;
                count[min_min_pointer]++;
                int temp = heights[min_pointer];
                heights[min_pointer] = heights[min_min_pointer];
                heights[min_min_pointer] = temp;
            }
            min_pointer++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i]);
            if (i != count.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < heights.length; i++) {
            if (count[i] > 0) {
                sum++;
            }
        }
        return sum;
    }
}
