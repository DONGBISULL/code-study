package main.java.lc.array;

public class CheckDuplicateExist {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 5, 3};
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }


    public static boolean checkIfExist(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
