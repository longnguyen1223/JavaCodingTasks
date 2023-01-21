package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
       unique1("AAABBBCCCDEF");
    }

    private static void unique(String str) {
        List<String> list =new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p->Collections.frequency(list,p)>1);
        String result="";
        for (String each : list) {
            result+=each;
        }
        System.out.println(result);
    } // use collections and lambda expressions.

    private static void unique1(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int frequency =0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)) frequency++;
            }
            if(frequency==1) result+=str.charAt(i);
        }
        System.out.println(result);
    }// use nested loop.
}
