package TASK.Polymorphism;

public class overriding {
    public static void main(String[] args) {
        dauther d = new dauther();
        d.bmw();
    }
}

class father
{
    void bmw()
    {
        System.out.println("BMW4");
    }
}
class  dauther extends father
{
    @Override
    void bmw()
    {
        System.out.println("BMW6");
    }
}
