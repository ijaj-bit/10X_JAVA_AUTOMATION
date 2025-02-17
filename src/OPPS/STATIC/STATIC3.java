package OPPS.STATIC;

public class STATIC3 {
    public static void main(String[] args) {
        A a = new A();
        A.op();
    }

}

class A{

    static
    {
        System.out.println("SOMETHING");
        System.out.println("READ,WRITE,FETCH");
    }
    static int a=100;

    static  void op()
    {
        System.out.println("THIS IS STATIC WORLD");
    }
}
