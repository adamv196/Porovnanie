import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();

        int a = rd.nextInt(50);
        int b = rd.nextInt(50);
        int c = rd.nextInt(50);

        System.out.println("Porovnanie cisel pomocou java.util.Random.");
        System.out.println("Cislo a je: " +a);
        System.out.println("Cislo b je: " +b);
        System.out.println("Cislo c je: " +c);
        System.out.println("--------------------------");

        if (a > b) {
            if (a > c){

                System.out.println(a);

            } else {

                System.out.println(c);
            }

        }else {
            if (b > c){

                System.out.println(b);

            }else{
                System.out.println(c);
            }
        }
    }
}