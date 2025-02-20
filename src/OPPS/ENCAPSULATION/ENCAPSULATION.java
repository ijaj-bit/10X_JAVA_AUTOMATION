package OPPS.ENCAPSULATION;
//Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.

public class ENCAPSULATION {
    public static void main(String[] args) {
        ICICI name = new ICICI("IJAJ",100);
        System.out.println(name.getBal());

        boolean isCashier = true;
        name.setBal(1000, isCashier);
        System.out.println(name.getBal());
        System.out.println(name.bank_name);
    }
}
class ICICI
{
    private  String name;
    private  long bal;

    public  String bank_name="ICICI";


    public  ICICI(String name,long bal)
    {
        this.name=name;
        this.bal=bal;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public long getBal()
    {
        return bal;
    }
    public  void setBal(long bal,boolean isCashier)
    {
        if(isCashier)
        {
            this.bal=bal;
        }
        else
        {
            System.out.println("NOT ALLOWED TO CHANGE BALANCE");
        }
    }

}