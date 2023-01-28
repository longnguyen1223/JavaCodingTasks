package week5;

import java.util.Collections;

public class PasswordVerification {
    public static void main(String[] args) {
        System.out.println(verifyPassword("!BBBBBBa"));

    }

    public static boolean verifyPassword(String password) {
        //1. Write a return method that can verify if a password is valid or not.
        //requirements:
        //1. Password MUST be at least have 6 characters and should not contain space
        //2. PassWord should at least contain one upper case letter
        //3. PassWord should at least contain one lowercase letter
        //4. Password should at least contain one special characters
        //5. Password should at least contain a digit
        //if all requirements above are met, the method returns true, otherwise returns false

        char[] charPassword = password.toCharArray();

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;
        boolean notContainSpace = true;
        if (charPassword.length < 6) return false;

        for (char each : charPassword) {
            if (Character.isDigit(each)) digit = true;
            if (Character.isUpperCase(each)) upperCase = true;
            if (Character.isLowerCase(each)) lowerCase = true;
            if (!Character.isLetterOrDigit(each)) specialChar = true;
            if (Character.isSpaceChar(each)) notContainSpace = false;

        }
        return upperCase && lowerCase && specialChar && digit && notContainSpace;

    }
}
