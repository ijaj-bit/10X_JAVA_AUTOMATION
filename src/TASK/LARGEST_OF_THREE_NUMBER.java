package TASK;

import java.util.Scanner;

public class LARGEST_OF_THREE_NUMBER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1:");
        int num1= sc.nextInt();
        System.out.println("NUMBER 2:");
        int num2=sc.nextInt();
        System.out.println("NUMBER 3:");
        int num3=sc.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println("NUM 1 IS GREATER");
        } else if (num2>num3)
        {
            System.out.println("NUM 2 IS GREATER");
        }
        else
        {
            System.out.println("NUM 3 IS GREATER");
        }
    }
}
