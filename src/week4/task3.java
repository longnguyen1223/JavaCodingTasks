package week4;

import java.util.Arrays;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        removeDup("AAABBBCCCfffff");
    }

    private static void removeDup(String str) {
        String result = "";
        for (String each : Arrays.asList(str.split(""))) {
            if (!result.contains(each)) result += each;
        }
        System.out.println(result);
    }
}

