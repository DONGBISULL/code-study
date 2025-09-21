package main.java.lc.array;

public class RemoveDuplicateArrays {

    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int write = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[write++] = nums[i];
            }
        }
        return write;
    }


}
