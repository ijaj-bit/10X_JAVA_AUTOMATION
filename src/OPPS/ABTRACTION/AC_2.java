package OPPS.ABTRACTION;

public class AC_2 {
    public static void main(String[] args) {
        BMW b=new BMW();
        b.startEngine();
        b.stopEngine();

    }
}


class BMW extends Engine
{
    void startEngine()
    {
        System.out.println("START");
    }
}

abstract class Engine
{
    abstract void startEngine();
     void stopEngine()
     {
         System.out.println("STOP");
     }

}

interface tyre
{
    //void m1()
    //{

    //}

    void m2();

}
