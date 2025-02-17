package OPPS.ABTRACTION;

public class AC_1 {
    public static void main(String[] args) {
        child c= new child();
        c.loan20k();
        c.loan50k();
    }

}
abstract  class Father
{
    abstract void loan50k();
    void loan20k()
    {
        System.out.println("PAY 20K");
    }
}

class child extends Father
{
    @Override
    void loan50k() {

    }

    void loan20k()
    {
        System.out.println("SON WILL PAY");
    }
}