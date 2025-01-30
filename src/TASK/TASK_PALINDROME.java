package TASK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TASK_PALINDROME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String str = sc.nextLine();
        String org = str;//here storing the value of str to org
        String rev=""; //here created empty string

        int len = str.length(); // to check length of the string

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);// reversed the string
        }
        if(org.equals(rev))// here it will compare with original sttring
        {
            System.out.println(org+" >String is Palindrome");
        }
        else
        {
            System.out.println(org+" >String is not a Palindrome");
        }




    }
}
