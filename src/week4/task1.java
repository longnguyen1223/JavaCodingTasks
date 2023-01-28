package week4;

import java.util.Arrays;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        FrequencyOfChars("AAABBCDD");

    }

    private static void FrequencyOfChars(String str) {
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)) count ++;
            }
            if(!result.contains(str.charAt(i)+"")) result+=str.charAt(i)+""+count;
        }
        System.out.println(result);
    }

    private static void FrequencyOfChars2(String str){
        String result="";
        for (String each : Arrays.asList(str.split(""))) {
            if(!result.contains(each)) result+=each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result);

    }

}
