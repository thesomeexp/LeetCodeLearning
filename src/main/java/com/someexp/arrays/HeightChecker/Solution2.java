package com.someexp.arrays.HeightChecker;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
//        int[] heights = {5,1,2,3,4};
//        int[] heights = {2,1,2,1,1,2,2,1};
        new Solution2().heightChecker(heights);
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i]);
            if (i != heights.length - 1) {
                System.out.print(",");
            }
        }
    }

    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        int[] sort =  new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            count[heights[i]] += 1;
        }
        int idx = 0, result = 0;
        for (int i=0; i<count.length; i++){
            while (count[i] > 0){
                sort[idx] = i;
                if (heights[idx] != sort[idx]) result++;
                idx++;
                count[i]--;
            }
        }
        return result;
    }
}
