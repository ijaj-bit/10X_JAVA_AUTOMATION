package FUNCTIONS;

import java.util.Scanner;

public class F_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER 1:");

        int a=0;
        if(sc.hasNext())
        {
            a=sc.nextInt();
        }
        else
        {
            System.out.println("Enter Int Only");
            System.exit(0);
        }

        System.out.println("NUMBER 2:");

        int b=0;

        if(sc.hasNext())
        {
            b=sc.nextInt();
        }
        else
        {
            System.out.println("Enter int only");
            System.exit(0);
        }
        int result = add(a,b);
        System.out.println(result);


    }
    static int add(int a,int b)
    {
        return a+b;
    }
}


