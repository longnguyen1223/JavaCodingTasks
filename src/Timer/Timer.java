package Timer;

import java.util.Scanner;

public class Timer {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter minute");
        int min = new Scanner(System.in).nextInt();

        for (int i = min - 1; i >= 0; i--) {
            for (int j = 59; j >= 0; j--) {
                Thread.sleep(1000);
                System.out.print("\r" + i + " min " + j + " second");
                /* The \r symbol is no more used that often.
                 It means carriage return which means go to the start of the line.
                 It was used together with \n
                 for being sure even "old" printers would
                  get to the beginning of the next line.ShareImprove this answer
                 */

            }
        }


 /* public static void main(String[] args) throws InterruptedException {

      Scanner scan=new Scanner(System.in);
      System.out.println("please enter the number of minutes");
      int minutes=scan.nextInt();

      scan.close();

      for (int i=minutes; i > 0 ;i--) {
          for (int z=59; z >=0 ;z--){
              System.out.print( "\r"+(i-1)+" minutes and "+z+" seconds left");
              Thread.sleep(1000);
          }
      }

      System.out.println("\n\n");

      System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
      System.err.println("\t\t\t*                                                 *");
      System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
      System.err.println("\t\t\t*                                                 *");
      System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

  }

  */

    }}

