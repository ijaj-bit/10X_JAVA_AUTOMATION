package TASK;

import java.util.Scanner;

public class Travel_Based_on_Visa_Status_and_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE:");
        int age= sc.nextInt();
        System.out.println("VISA STATUS:");
        boolean visa = sc.nextBoolean();
        if(age>=18 && visa==true)
        {
            System.out.println("Person can travel");
        } else if (age<=18 && visa==false)
        {
            System.out.println("Person cannot travel");
        }

    }
}
