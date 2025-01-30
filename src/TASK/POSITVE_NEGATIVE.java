package TASK;

import java.util.Scanner;

public class POSITVE_NEGATIVE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        if(number>0)
        {
            System.out.println("POSITIVE NUMBER");
        }
        else
        {
            System.out.println("NEGATIVE NUMBER");
        }
    }
}
