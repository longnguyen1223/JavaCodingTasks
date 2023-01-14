package week4;

import java.util.Arrays;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        removeDup("AAABBBCCCfffff");
    }

    private static void removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) result += str.charAt(i);
        }
        System.out.println(result);
    }

}

