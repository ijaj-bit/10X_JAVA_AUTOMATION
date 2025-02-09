package TASK;

import java.util.Scanner;

public class DIVISIBLE_5_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER:");

        int number = sc.nextInt();

        if(number%5==0 && number%10==0)
        {
            System.out.println("DIVISIBLE BY 5 AND 10");
        }
        else
        {
            System.out.println("NOT DIVISIBLE BY 5 AND 10");
        }
    }
}
