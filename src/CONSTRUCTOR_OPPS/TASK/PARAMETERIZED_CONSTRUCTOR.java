package CONSTRUCTOR_OPPS.TASK;

public class PARAMETERIZED_CONSTRUCTOR {

    public static void main(String[] args) {
        PARAMETERIZED_CONSTRUCTOR add = new PARAMETERIZED_CONSTRUCTOR();
        //add.PARAMETERIZED_CONSTRUCTOR(10,20);
        System.out.println(add.PARAMETERIZED_CONSTRUCTOR(10,20));
    }

    int PARAMETERIZED_CONSTRUCTOR(int a,int b)
    {
        return a+b;
    }
}
