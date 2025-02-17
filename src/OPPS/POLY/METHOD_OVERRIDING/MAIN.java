package OPPS.POLY.METHOD_OVERRIDING;

public class MAIN {

    public static void main(String[] args) {
        SON s1 = new SON();
        s1.home();
        s1.s1();


        Father f1= new Father();
        f1.home();

        Father s2 = new SON();//DYNAMIC DISPATH
        s2.home();// method overriding - ridden the father method
    }
}
