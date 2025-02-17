package OPPS.POLY.METHOD_OVERLOADING;

public class EXP_2 extends EXP_1 {
    public static void main(String[] args) {
        EXP_2 z = new EXP_2();

        int r = z.add(2,4);
        System.out.println(r);

        int r2 = z.add(3,5,6);
        System.out.println(r2);

    }
}
