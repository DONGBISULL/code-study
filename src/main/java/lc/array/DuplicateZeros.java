package main.java.lc.array;


public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1,5,2,0,6,8,0,6,0};
        main(arr);
    }

    public static void main(int[] arr) {
        int[] duplicate = arr.clone();
        int index = 0;
        for (int i = 0; i < duplicate.length && index < arr.length; i++) {
            System.out.println("duplicate[i] >>> " + duplicate[i]);
            if (duplicate[i] == 0) {
                arr[index] = 0;
                index++;
                if (index + 1 <= duplicate.length) {
                    arr[index] = 0;
                    index++;
                }
            } else {
                arr[index] = duplicate[i];
                index++;
            }
        }
    }
}