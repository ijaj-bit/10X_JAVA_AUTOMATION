package TASK;

import java.util.Scanner;

public class SMALLEST_OF_2_NUMBER {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        int num1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int num2= sc.nextInt();

        if(num1<num2)
        {
            System.out.println("NUM 1 IS SMALLEST NUMBER");
        }
        else
        {
            System.out.println("NUM 2 IS SMALLEST NUMBER");
        }
    }
}
