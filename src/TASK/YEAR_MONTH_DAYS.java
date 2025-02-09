package TASK;

import java.util.Scanner;

public class YEAR_MONTH_DAYS {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Specific Number");
        int number = sc.nextInt();

        int years = number/365;
        int days = number%365;
        int month = days/30;
        days = days%30;

        System.out.println(years+ "Year\t"+month+ "Month\t"+days+ "Days\t");
    }

}
