package IF_CONDITION;

import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid Integer");
                int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not Allowed,Should be 18+");
        }

    }
}
