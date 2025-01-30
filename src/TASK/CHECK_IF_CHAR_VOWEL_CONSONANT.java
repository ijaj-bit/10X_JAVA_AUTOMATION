package TASK;

import java.util.Scanner;

public class CHECK_IF_CHAR_VOWEL_CONSONANT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charracter:");
        char ch= sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(Character.isLetter(ch))
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch+" is VOWEL");
            }
            else
            {
                System.out.println(ch+" is CONSONANT");
            }

        }else
        {
            System.out.println("INVALID INPUT PLEASE ENTER VALID INPUT");
        }



    }
}
