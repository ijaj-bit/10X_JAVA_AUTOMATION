package OPPS.INHERITANCE.MULTILEVEL;

import OPPS.INHERITANCE.SINGLE_INHERITANCE.Father;

public class MAIN {

    public static void main(String[] args) {

        SON s1= new SON();
        s1.home();
        s1.BHK();

        Father f1 = new Father();

        GrandFather g1 = new GrandFather();
        g1.BHK();
    }
}
