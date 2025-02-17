package CONSTRUCTOR_OPPS;

public class DC_2 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}

class A{

    A()
    {
        System.out.println("OBJ");
        System.out.println("OBJ2");
        System.out.println("OBJ3");
    }

}
