package week5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task2_array_find_max {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 500, 600, -100, 1000};
        findMax1(arr);
        findMax2(arr);

    }

    private static void findMax1(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println(Collections.max(list));

    } // convert to List and use Collections

    private static void findMax2(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int each : arr) {
            if (each > max) max=each;
        }
        System.out.println(max);

    } //


}
