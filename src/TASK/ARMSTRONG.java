package TASK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ARMSTRONG {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");//Take User Input...
        int num=sc.nextInt();
        int o_num=num; //Saving value into o_num
        int sum=0;
        int n=String.valueOf(num).length();
        while(num>0)
        {
            int digit = num%10;
            sum += Math.pow(digit,n);
            num /=10;
        }
        if(sum==o_num)
        {
            System.out.println(o_num+" THIS IS ARMSTRONG NUMBER:");
        }
        else
        {
            System.out.println(o_num+" THIS IS NOT A ARMSTRONG NUMBER:");
        }
    }
}
