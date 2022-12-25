package week1;

public class task1 {
    public static void main(String[] args) {
        even_or_odd(0);

    }
    public static void even_or_odd(int num){
        String result= (num%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}
