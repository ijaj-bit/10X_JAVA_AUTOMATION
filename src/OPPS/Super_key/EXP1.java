package OPPS.Super_key;

public class EXP1 {
    public static void main(String[] args) {
        Baseclass.TC1 t1 = new Baseclass.TC1("CHROME");
        t1.openBrowser();
        System.out.println("TC1 IS RUNNING:");
        t1.closeBrowser();

        System.out.println(t1.getBrowser());

        Baseclass.TC1 t2 = new Baseclass.TC1("EDGE");
        System.out.println(t2.getBrowser());
    }
}


class Baseclass
{
    private String browser;
    public Baseclass(String browser)
    {
        this.browser=browser;
    }

    public  String getBrowser()
    {
       return browser;
    }
    public void setBrowser(String browser,boolean isAdmin)
    {
        if(isAdmin)
        {
            this.browser=browser;
        }
        else
        {
            System.out.println("CHANGE BROWSER NOT ALLOWED,NOT A ADMIN");
        }
    }
    void openBrowser()
    {
        System.out.println("Browser is Opening");
    }

    void openBrowser(String browser)
    {
        System.out.println("BROWSER IS>"+browser);
    }

    void closeBrowser()
    {
        System.out.println("BROWSER IS CLOSING:");
    }

    static class TC1 extends Baseclass
    {

        public TC1(String browser) {
            super(browser);
        }

        @Override
        public void setBrowser(String browser, boolean isAdmin) {
            System.out.println("OVERRID PARENT BROWSER:");
        }
    }

}
