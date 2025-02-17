package CONSTRUCTOR_OPPS;

public class CONSTRUCTOR {
    int a;
    String name;
    public static void main(String[] args) {
        CONSTRUCTOR c1 = new CONSTRUCTOR();
        c1.display();
    }
    CONSTRUCTOR()
    {
        a=5;
        name="PINK";
    }
    public  void display()
    {
        System.out.println(a+":"+name);
    }

}
