package week5;

public class freshInterviewTask2 {
    /*
    1) Write a recursive method that returns a boolean value if the String is palindrome or not.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("amma"));
    }
        public static boolean isPalindrome(String s) {
            if (s.length() == 0 || s.length() == 1)
                return true;
            if (s.charAt(0) == s.charAt(s.length() - 1))
                return isPalindrome(s.substring(1, s.length() - 1));
            return false;
        }

}
