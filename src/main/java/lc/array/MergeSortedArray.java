package main.java.lc.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        answer(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums1.length; i++) {
            if (i >= m) {
                int idx = i - m;
                nums1[i] = nums2[idx];
            }
        }
        Arrays.sort(nums1);
    }

    public static void answer(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // nums1의 유효 끝
        int j = n - 1;        // nums2의 끝
        int k = m + n - 1;    // nums1의 최종 끝(뒤에서 채움)
        while (j >= 0) { // nums2가 남아있는 동안만 처리하면 됨
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
