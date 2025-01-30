package TASK;

import java.util.Scanner;

public class LEAP_YEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println(year+" THIS IS LEAP YEAR");
        }
        else
        {
            System.out.println(year+" THIS IS NOT AN LEAP YEAR");
        }
    }
}
