package main.java.lc.array;

public class ReplaceElement {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] target = replaceElements(arr);
        System.out.println(target);
    }

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                int cnt = arr[j];
                if (max < cnt) {
                    max = cnt;
                }
            }
            arr[i] = max;
            if (i == arr.length - 1) arr[i] = -1;
        }
        return arr;
    }
}
