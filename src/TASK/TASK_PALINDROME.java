package TASK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TASK_PALINDROME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str,rev="";

        System.out.println("ENTER THE STRING:");
        str = sc.nextLine();

        int len = str.length();

        for(int i=len-1;i>=0;i--) {
            rev = rev + str.charAt(i);

              if (str.equals(rev)) {
                System.out.println(str + "is a Palindrome");
            } else {
                System.out.println(str + "Not a Palindrome");
            }
            }


    }
}
