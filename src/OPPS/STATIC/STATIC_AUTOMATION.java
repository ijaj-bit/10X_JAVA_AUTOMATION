package OPPS.STATIC;

import org.w3c.dom.ls.LSOutput;

public class STATIC_AUTOMATION {

    public static void main(String[] args) {
        AUTOMATION A= new AUTOMATION();
        System.out.println(A.driver);
        System.out.println(AUTOMATION.driver);
        AUTOMATION.driver2="FIREFOX";
        System.out.println(A.driver2);
        System.out.println(A.driver);
    }



}
class AUTOMATION
{
    static String driver="Chrome";
    static  String driver2;
}