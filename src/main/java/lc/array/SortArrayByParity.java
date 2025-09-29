package main.java.lc.array;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4};
        int[] result = sortArrayByParity(arr);
        System.out.println(result);
    }

    public static int[] sortArrayByParity(int[] nums) {
        int targetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                int num = nums[targetIndex];
                nums[targetIndex] = temp;
                nums[i] = num;
                targetIndex++;
            }
        }
        return nums;
    }
}
