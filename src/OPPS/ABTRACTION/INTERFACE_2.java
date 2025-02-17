package OPPS.ABTRACTION;

public class INTERFACE_2 {
    public static void main(String[] args) {
        P p = new P();
        p.math();
        p.science();
    }
}
class P implements Course
{
    public void math()
    {
        System.out.println("MATH");
    }
    public void science()
    {
        System.out.println("SCIENCE:");
    }
}
interface  Course
{
    void math();
    void science();
}
