package TASK;

import java.util.Scanner;

public class SMALLEST_OF_3_NUMBER {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        int num1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int num2= sc.nextInt();
        System.out.println("ENTER THIRD NUMBER:");
        int num3 = sc.nextInt();
        if(num1<num2)
        {
            System.out.println("NUM 1 IS SMALLEST NUMBER");
        } else if (num2<num3 && num1<num3)
        {
            System.out.println("NUM 2 IS SMALLEST NUMBER");
        }else
        {
            System.out.println("NUM 3 IS SMALLEST NUMBER");
        }
    }
}
