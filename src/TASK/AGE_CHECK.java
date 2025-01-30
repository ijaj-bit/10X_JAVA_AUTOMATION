package TASK;

import java.util.Scanner;

public class AGE_CHECK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println(age+" EGLIGIBLE FOR VOTE");
        }
        else
        {
            System.out.println(age+" NOT EGLIGIBLE FOR VOTE");
        }
    }
}
