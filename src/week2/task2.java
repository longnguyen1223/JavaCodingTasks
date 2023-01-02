package week2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        int c=new Scanner(System.in).nextInt();
        String divisible_15="Divisible by 15";
        String divisible_5="Divisible by 3";
        String divisible_3="Divisible by 5";
        for (int i = 1; i <=c ; i++) {
            if(i%15==0){
               divisible_15+=" "+i;
            } else if (i%5==0) {
                divisible_5+=" "+i;

            } else if (i%3==0) {
                divisible_3+=" "+i;

            }
            else{continue;}
        }
        System.out.println(divisible_15);
        System.out.println(divisible_5);
        System.out.println(divisible_3);


    }

}
