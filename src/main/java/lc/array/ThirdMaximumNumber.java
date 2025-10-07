package main.java.lc.array;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int i = thirdMax(arr);
        System.out.println(i);
    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> sets = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            sets.add(num);
        }
        if (sets.size() >= 3) {
            Iterator<Integer> iterator = sets.iterator();
            iterator.next();
            iterator.next();
            return iterator.next();
        } else {
            return sets.first();
        }
    }

}
