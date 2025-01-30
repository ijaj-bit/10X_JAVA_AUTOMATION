package SWITCH;

import java.util.Scanner;

// User - Enter int number from 1 to 7
// Which day it is it
// 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
public class SWITCH_BASIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DAY FROM 1 TO 7");
        int day=sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("NO idea!,Which Date is");
        }

    }
}
