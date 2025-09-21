package main.java.lc.array;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 5};
        boolean result = validMountainArray(arr);
        System.out.println(result);
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        // 시작점
        int left = 0;
        // 끝
        int right = arr.length - 1;
        // 시작점
        while (left < arr.length - 1 && arr[left] < arr[left + 1]) {
            left++;
        }

        while (right - 1 >= 0 && arr[right - 1] > arr[right]) {
            right--;
        }

        return left == right && left > 0 && right < arr.length - 1;
    }
}
