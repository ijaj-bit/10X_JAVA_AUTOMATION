package CONSTRUCTOR_OPPS;

public class DC_1 {
    public static void main(String[] args) {
        baby b1=new baby();
        new baby();
        new baby();
        baby b2;
    }
}
class  baby
{
    baby()
    {  // Default Constructor also called
        System.out.println("OBJECT IS CREATED");
    }
    {// Instance initialization block
        System.out.println("OBJECT IS NOT CREAEATED");
    }
}