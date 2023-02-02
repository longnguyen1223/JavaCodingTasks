package week5;

public class sum_of_digits_inAString {
    public static void main(String[] args) {
        String a = "1,2,3,4,5,6";
        sum(a);
        String str = "1232";
        sum2(str);
    }

    private static void sum(String str) {
        String[] split = str.split(",");
        int total = 0;
        for (String s : split) {
            total += Integer.parseInt(s);
        }
        System.out.println(total);
    }

    private static void sum2(String str) {
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') continue;
            total += Integer.parseInt(str.charAt(i) + "");
        }
        System.out.println(total);
    }


}
