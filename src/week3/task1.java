package week3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(8));

    }

    public static boolean checkPrimeNumber(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


