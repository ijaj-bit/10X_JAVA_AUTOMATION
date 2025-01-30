package IF_CONDITION;

import java.util.Scanner;

public class EVEN_ODD_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid number:");

        int num =sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
