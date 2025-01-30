package TASK;

import java.util.Scanner;

public class ATM_WITHDRAW_SIMULATION {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize the account balance (e.g., ₹10,000).
        int balance=10000;
        // Take user input for the withdrawal amount.
        System.out.println("Enter Withwal AMOUNT:");
        int amount=sc.nextInt();
        // Check withdrawal conditions:
        //1.Amount must be greater than zero
        //2.Amount must be a multiple of 100
        //3.Amount should not exceed balance
        if(amount>=0 && amount%100==0 && amount<10000)
        {
            // Deduct the amount & display updated balance
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
        else
        {
            System.out.println("INVALID WITHDRAWAL AMOUNT!");
        }


    }
}
