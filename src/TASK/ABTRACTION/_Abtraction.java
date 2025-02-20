package TASK.ABTRACTION;

public class _Abtraction {
    public static void main(String[] args) {
        HARRIER h = new HARRIER();
        h.fuelType();
        h.color();
    }
}

abstract class car{

    public abstract void fuelType();
    public void color()
    {
        System.out.println("WHITE");
    }//WE CAN DECLARE NORMAL METHOD ASWELL....
}

class HARRIER extends car
{
    public void fuelType()
    {
        System.out.println("PETROL");
    }
}
//Abstraction is the process of hiding the internal details of an object and only showing the essential features.
