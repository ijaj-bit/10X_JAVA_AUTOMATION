package CONSTRUCTOR_OPPS.TASK;

public class C_OVERLOAD {


    C_OVERLOAD(int a)
    {
        System.out.println("NUMBER IS:" +a);
    }
    C_OVERLOAD()
    {
        System.out.println("HI THIS ME WITH SAME CONSTRUCTOR NAME>C_OVERLOAD");
    }

    public static void main(String[] args) {
        C_OVERLOAD x = new C_OVERLOAD(10);
        C_OVERLOAD b = new C_OVERLOAD();
    }
}
