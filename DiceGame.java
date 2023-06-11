package DM;
import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");

        int num1 = rnd.nextInt(6)+1;
        int num2 = rnd.nextInt(6)+1;
        int sum = num1 + num2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: "+num1);
        System.out.println("Die 2: "+num2);
        System.out.println("Total value: "+sum);
    }
}