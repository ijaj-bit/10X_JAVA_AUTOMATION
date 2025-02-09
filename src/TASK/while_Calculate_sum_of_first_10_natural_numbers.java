package TASK;

import java.util.Scanner;

public class while_Calculate_sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ENTER THE NUMBER");
        //int n= sc.nextInt();
        int n=1;
        int sum=0;
        while(n<=10)
        {
            sum +=n;
            n++;
        }
        System.out.println(sum);
    }
}
