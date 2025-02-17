package OPPS.Access_Modifier.cop;

public class COP {


    public  int gun;
    String iCard;

    public COP(int gun)
    {
        this.gun=gun;
    }
    protected void canIshoot()
    {
        System.out.println("YES YO CAN SHOOT:");
    }

}
