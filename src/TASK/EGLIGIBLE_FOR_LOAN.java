package TASK;

import java.util.Scanner;

//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
public class EGLIGIBLE_FOR_LOAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age");
        int age=sc.nextInt();
        System.out.println("ENTER THE CADIDATE SALARY");
        float salary = sc.nextFloat();
        System.out.println("ENTER THE CREDIT SCORE");
        int credit_score = sc.nextInt();

        if(age>0 && age>=18 && age<=80 && salary>0 && salary>=30000 && credit_score>=0 && credit_score>=650 && credit_score<=850)
        {
            System.out.println("THIS PERSON HAS BEEN APPROVED FOR LOAN");
        }else
        {
            System.out.println("THIS PERSON HAS NOT  APPROVED FOR LOAN");
        }

    }
}
