package TASK;

import java.util.Scanner;

public class Print_the_sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();
         int sum= n*(n+1)/2;
        System.out.println("Sum of "+n+" Natural Number is "+sum);


        }
    }

