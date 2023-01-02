package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        swap_Numbers();
    }
    public static void swap_Numbers(){// x=1 y=2
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x: ");
        int x=sc.nextInt();
        System.out.println("enter y: ");
        int y=sc.nextInt();
        x= x+y; //x=1+2;
        y=x-y;//y=3-2;
        x=x-y;   //x=3-1;
        System.out.println("after swap now x= "+x+", y= "+y);
        sc.close();

    }
}
