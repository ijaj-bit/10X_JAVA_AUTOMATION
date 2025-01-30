package SWITCH;
// Web Automation
// I will ask user which browser you want me to run the code.
// chrome -> execute chrome
// firefox -> execute of firefox
// edge -> edge browser cases.

import java.util.Scanner;

public class SWITCH_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WHICH BROWSER YOU WANT TO RUN:");

        String Browser = sc.next();

        switch (Browser)
        {
            case "Chrome":
                System.out.println("YES,Chrome is Available");
                break;
            case "Firefox":
                System.out.println("YES,Firefox is Available");
                break;
            case "Edge":
                System.out.println("YES,Edge is Available");
                break;
            default:
                System.out.println("NO,This Not available");
        }

    }

}
