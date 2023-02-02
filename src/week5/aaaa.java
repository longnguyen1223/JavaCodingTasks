package week5;

public class aaaa {
    public static void main(String[] args) throws InterruptedException {

            countdown(5);
        }
    public static void countdown(int n) throws InterruptedException {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
          //  Thread.sleep(2000);
            countdown(n - 1);
        }}}



