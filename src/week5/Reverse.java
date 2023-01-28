package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
    reverse1("ABCD123456789poi");
    }

    private static void reverse(String str) {
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);
    } // use nested loop.
    private static void reverse1(String str){
        List<String> list =new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        String result="";
        for (String s : list) {
            result+=s;
        }
        System.out.println(result);

    } //use collections util reverse() method.


}
