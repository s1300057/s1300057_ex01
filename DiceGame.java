package DM;
import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
        Random rnd = new Random();

        int num1 = rnd.nextInt(6)+1;
        int num2 = rnd.nextInt(6)+1;
        int sum = num1 + num2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: "+num1);
        System.out.println("Die 2: "+num2);
        System.out.println("Total value: "+sum);
    }
}