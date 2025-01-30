package TASK;

import java.util.Scanner;

public class Check_Character_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER");
        char ch=sc.next().charAt(0);
        //ch=Character.toUpperCase(ch);
        //ch=Character.toLowerCase(ch);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            System.out.println(ch +" THIS IS ALPHABET");
        }
        else
        {
            System.out.println(ch +"THIS IS NOT AN ALPHABET");
        }
    }
}
