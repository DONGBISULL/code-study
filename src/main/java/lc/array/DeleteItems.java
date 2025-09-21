package main.java.lc.array;

import java.util.Arrays;

public class DeleteItems {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
    }

    private static int removeElement(int[] nums, int val) {
        int write = 0;
        for (int i = 0 ; i <nums.length ; i++ ) {
            if (nums[i] != val) {
                nums[write++] = nums[i];
            }
        }
        return write;
    }
}
