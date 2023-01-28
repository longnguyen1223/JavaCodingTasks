package week4;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        System.out.println(same2("abc", "cbad"));
    }

    private static boolean same(String str1, String str2) {
     /*     Set<String> set1=(Set<String>) new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2=(Set<String>) new TreeSet<>(Arrays.asList(str2.split("")));

      */ // set does not accept duplicate so this solution will not work.
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
    private static boolean same2(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        for (int i = 0; i <str1.length() ; i++) {
            if(!str1.contains(str2.charAt(i)+"")) return false;
        }
        return true;
    }




}
