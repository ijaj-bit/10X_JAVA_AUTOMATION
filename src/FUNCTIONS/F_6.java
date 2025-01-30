package FUNCTIONS;

import java.util.Scanner;

public class F_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b= sc.nextInt();

        int result = add(a,b);
        int result1= sub(10,20);
        int result2= mul(20,2);
        int result3 = div(10,2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);




    }

    static int add(int a,int b)
    {
        return a+b;
    }

    static int sub(int a,int b)
    {
        return a-b;
    }

    static int mul(int a,int b)
    {
        return a*b;
    }
    static  int div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Please put valid Number");
        }
        return a/b;
    }
}
