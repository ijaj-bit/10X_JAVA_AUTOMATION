package TASK;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF UNIT CONSUMED:");

        float unit = sc.nextFloat();

        int total_bill = 0;

        if(unit>100)
        {
            total_bill += (unit - 100)*0.75;
            unit = 100;
            unit+=0.25;
        } else if (unit>200)
        {
          total_bill +=(unit - 200)*1.20;
          unit=200;
        } else if (unit>300)
        {
            total_bill+=(unit-300)*1.50;

        }
        System.out.println(" TOTAL ELECTRICITY BILL:"+total_bill+"RS");
    }
}
