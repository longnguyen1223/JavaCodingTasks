package week1;

public class task3 {
    public static void main(String[] args) {
        System.out.println(checkFinra(30));

    }
    public static String checkFinra(int num){
        String result ="";
        for (int i = 1; i <=num ; i++) {
             result+=(i%3==0&&i%5!=0)?" FIN":(i%5==0&&i%3!=0)?" RA":(i%15==0)?" FINRA":" "+i;
        }
        return result;

    }
}
