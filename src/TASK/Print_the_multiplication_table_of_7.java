package TASK;

import java.util.Scanner;

public class Print_the_multiplication_table_of_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();

        int i=1;
        while(i<=10)
        {
            System.out.println(num*i);
            i++;
        }



    }
}
