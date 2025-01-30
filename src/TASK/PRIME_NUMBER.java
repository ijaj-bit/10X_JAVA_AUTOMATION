package TASK;

import java.util.Scanner;

public class PRIME_NUMBER {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        if(num<=1)
        {
            System.out.println("NOT PRIME NUMBER");
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println("NOT PRIME");
                break;
            }else {
                System.out.println("PRIME");
                break;
            }
        }

    }
}
