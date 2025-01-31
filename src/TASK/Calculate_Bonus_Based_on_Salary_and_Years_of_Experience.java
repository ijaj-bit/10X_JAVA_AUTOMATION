package TASK;

import java.util.Scanner;

public class Calculate_Bonus_Based_on_Salary_and_Years_of_Experience {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER USER SALARY");
        double salary = sc.nextDouble();
        System.out.println("ENTER USER EXPERIENCE");
        int exp = sc.nextInt();

        double bonus=0;

        if(exp<=1)
        {
            bonus = 0;
        } else if (exp<=3)
        {
            bonus = salary*0.05;
        } else if (exp>=4 && exp<=6)
        {
            bonus= salary*0.10;
        } else{
            bonus=salary*0.15;
        }
        System.out.println("YOUR BONUS AMOUNT IS:" +bonus+"RS");
    }
}
