package OPPS.ABSTRACTION;

public class INTERFACE_1 {

    public static void main(String[] args) {
        car c = new car();
        c.startEngine();
        c.applybreak();
        c.stopEngine();

    }

}
interface engine{
    void startEngine();
    void stopEngine();
    default void test()
    {
        System.out.println("Concrete");
    }
}

interface applybreak
{
    void applybreak();
}

class car implements engine,applybreak
{
    void driver()
    {
        startEngine();
        applybreak();
        stopEngine();
    }
    public void startEngine()
    {
        System.out.println("START");
    }
    public void applybreak()
    {
        System.out.println("APPLY BREAK");
    }
    public  void stopEngine()
    {
        System.out.println("STOP");
    }

}