package week1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(even_or_odd(12));
    }

    public static String even_or_odd(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";

        return result;
    }
}
