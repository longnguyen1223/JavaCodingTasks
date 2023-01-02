package week2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        int N=new Scanner(System.in).nextInt();
        for (int i = 1; i <=N ; i++) {

            if(i%60==0){
                System.out.println("CodilityTestCoders");
            }
            else if (i%6==0){
                System.out.println("CodilityTest");
            }
            else if (i%10==0) {
                System.out.println("CodilityCoders");

            }
            else if (i%15==0) {
                System.out.println("TestCoders");

            }
            else if (i%2==0) {
                System.out.println("Codility");

            }
            else if (i%3==0) {
                System.out.println("Test");

            }
            else if (i%5==0) {
                System.out.println("Coders");

            }
            else{
                System.out.println(i);
            }
          /*  else  {
                switch (i){
                    case 2:
                        System.out.println("Codility");
                        break;
                    case 3:
                        System.out.println("Test");
                        break;
                    case 5:
                        System.out.println("Coders");
                        break;
                    default:break;
                }

            }

           */



        }
    }
}
/*
2 Codility
3 Test
5 Coders
2 3 5 CodilityTestCoders
 */
