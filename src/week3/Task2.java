package week3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        reverseNegativeNumber();

    }

    private static void reverseNegativeNumber() {
        System.out.println("enter an negative number and i will reverse it for you :D!!.");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num > 0) {
                System.err.println("Opp! Sorry Number should be negative please try again");
                break;
            }
          /*  int num =new Scanner(System.in).nextInt();
            if(num>0){
                System.err.println("i just take negative number please re entry or entry another positive number to quit the program");
                num =new Scanner(System.in).nextInt();
                if(num>0) break;
            }
            list = new ArrayList<>(Arrays.asList(String.valueOf(num).split("")));
            Collections.reverse(list);
            String a="-";
            for (int i = 0; i < list.size()-1; i++) {
                a+= list.get(i);
            }
            int result=Integer.parseInt(a);
            System.out.println("reverse version = " + result);

           */
            String reverse = "";

            String str = String.valueOf(num);
            for (int i = str.length() - 1; i >= 1; i--) {
                reverse += str.charAt(i);
            }
            int result = Integer.parseInt("-" + reverse);
            System.out.println("reverse version is : " + result);




        }
    }


}
//-123 -> 321
/*

2. Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */