package OPPS.STATIC;

public class STATIC2 {


    public static void main(String[] args) {
        ATB a1=new ATB("IJAJ",238473048);
        ATB a2=new ATB("MAHESH",937373737);
        System.out.println(a1.name);
        System.out.println(a1.number);
        System.out.println();
        System.out.println(a2.name);
        System.out.println(a2.number);
        System.out.println(ATB.course_name);

        a1.display();

        ATB.m1();

    }
}

class ATB
{
    static String course_name="10xJAVA";

    String name;
    int number;

    public ATB(String name,int number)
    {
        this.name=name;
        this.number=number;
    }
    void display()
    {
        System.out.println(this.name+this.number+course_name);
    }

     static void m1()
    {
        System.out.println("THIS IS STATIC WORLD");
    }
}