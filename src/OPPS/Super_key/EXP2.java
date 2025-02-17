package OPPS.Super_key;

public class EXP2 {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }



}

class Father
{
    Father()
    {
        System.out.println("DC FATHER");
    }

    int gold = 100;
    void home()
    {
        System.out.println("Father Home:");
    }

}

class Son extends  Father
{
    Son()
    {
        super();
    }
    void t1()
    {
        super.home();
        System.out.println(super.gold);

    }
}