package main.java.lc.array;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        int checker = heightChecker(heights);
        System.out.println(checker);
    }

    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] corrects = new int[heights.length];
        int write = 0; // 다음 삽입 위치
        while (write < heights.length) {
            int height = heights[write]; // 새로 삽입할 값
            System.out.println(" height >>" + height);
            // 오른쪽(맨뒤)의 값부터 정렬하도록 설정
            int j = write - 1;
            while (j >= 0 && corrects[j] > height) {
                corrects[j + 1] = corrects[j];
                j--;
            }
            corrects[j + 1] = height;
            write++;
        }

        for (int i = 0 ; i < heights.length ; i++ ) {
            if (corrects[i] != heights[i]) result++;
        }

        return result;
    }

}
