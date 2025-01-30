package IF_CONDITION;

import java.util.Scanner;

public class IF_ELSEIF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= sc.nextInt();
        System.out.println("Enter number 2");
        int num2= sc.nextInt();

        if(num1>num2) {
            System.out.println("Num1 is greater");
        } else if(num2>num1)
        {
            System.out.println("Num2 is greater");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
