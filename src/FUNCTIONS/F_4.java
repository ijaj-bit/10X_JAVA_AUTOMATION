package FUNCTIONS;

import java.util.Scanner;

public class F_4 {
    public static void main(String[] args)
    {
        //1
        CAR();
        //2
        String s=SKODA();
        System.out.println(s);

        int age= age();
        System.out.println(age);

        //3
        //1.
        First_name("IJAJ");

        //2.
        FULL_NAME("IJAJ","SHAIKH");

        //3.
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME :");
        String name = sc.next();
        System.out.println("AGE:");
        int age1 = sc.nextInt();
        System.out.println("SALARY:");
        long Salary = sc.nextLong();

        FULL_DETAIL(name,age1,Salary);

        //4.
        System.out.println("ADDITION");
         int x= addition(10,20);
        System.out.println(x);


    }
    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void CAR()
    {
        System.out.println("THIS IS CAR");
    }
    //  2. Without Parameters but With Return Type

    static String SKODA()
    {
        return "THIS IS SKODA";
    }

    static  int age()
    {
        System.out.println("THIS MY AGE:");
        return 26;
    }

    //  3. With Parameters and Without Return Type (void)

    //1.
    static void First_name(String F_name)
    {
        System.out.println("MY FIRST NAME IS:"+F_name);
    }
    //2.
    static void FULL_NAME(String F_name,String L_name)
    {
        System.out.println("MY FULL NAME IS:"+ F_name+"_"+L_name);
    }

    //3.
    static void FULL_DETAIL(String name,int age1,long Salary)
    {
        System.out.println("YOUR NAME:"+name+"\nYOUR AGE:" +age1+"\nYOUR SALARY:"+Salary);
    }

    //  4. With Parameters and With Return Type

     //1.

    static int addition(int a,int b)
    {
        return a+b;
    }

}
