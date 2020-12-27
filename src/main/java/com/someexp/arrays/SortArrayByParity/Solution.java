package com.someexp.arrays.SortArrayByParity;

/**
 * @author someexp
 * @date 2020/9/2
 */
public class Solution {
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        new Solution().sortArrayByParity(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i != A.length - 1) {
                System.out.print(",");
            }
        }
    }

    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int even_pointer = 0;
        int odd_pointer = 0;
        while (even_pointer < len && odd_pointer < len) {
            while (even_pointer < len && A[even_pointer] % 2 != 0) {
                even_pointer++;
            }
            while (odd_pointer < len && A[odd_pointer] % 2 == 0) {
                odd_pointer++;
            }
            if (even_pointer > odd_pointer && even_pointer < len && odd_pointer < len) {
                int temp = A[even_pointer];
                A[even_pointer] = A[odd_pointer];
                A[odd_pointer] = temp;
            }
            even_pointer++;
        }
        return A;
    }
}
