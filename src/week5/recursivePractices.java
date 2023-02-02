package week5;

public class recursivePractices {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(countEars(5));
    }

    public static int factorial(int num){
        if(num==1) return 1;

return  num*factorial(num-1);
    }

    public static int countEars(int bunnies){
        if(bunnies==1) return 2;
        if(bunnies==0) return 0;

        return 2* countEars(bunnies-1);
    }
}
