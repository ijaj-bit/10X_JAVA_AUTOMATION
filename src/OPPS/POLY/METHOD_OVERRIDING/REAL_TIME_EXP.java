package OPPS.POLY.METHOD_OVERRIDING;

public class REAL_TIME_EXP {
    public static void main(String[] args) {
        TC1 t1= new TC1();
        t1.openBrowser();

        TC2 t2 = new TC2();
        t2.openBrowser();
    }

}

class openToall
{
    void openBrowser()
    {
        System.out.println("OPEN BROWSER IN 5SEC:");
    }
}


class TC1 extends  openToall
{
    void startTC1(){
       openBrowser();
    }

}

class TC2 extends  openToall
{
    @Override
    void openBrowser() {
        super.openBrowser();
        System.out.println("OPEN BROWSER IN 2SEC");
    }
}