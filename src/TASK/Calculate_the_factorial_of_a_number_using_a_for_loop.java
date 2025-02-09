package TASK;

import java.util.Scanner;

public class Calculate_the_factorial_of_a_number_using_a_for_loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");

        int num = sc.nextInt();

        long fact = 1;

        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }

        System.out.println("FACTORIAL OF "+num+" IS="+fact);
    }
}
