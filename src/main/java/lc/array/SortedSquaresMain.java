package main.java.lc.array;

public class SortedSquaresMain {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int write = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[write]; // 삽입할 값
            int read = write - 1;
            while (read >= 0 && nums[read] > num) {
                nums[read + 1] = nums[read];
                read--;
            }
            nums[read + 1] = num;
            write++;
        }
        return nums;
    }
}
