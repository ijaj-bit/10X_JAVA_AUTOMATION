package OPPS.Super_key;

public class PARAM_C {
    public static void main(String[] args) {
        Mobile iphone= new Mobile("iphone","2000");
        Mobile samsung= new Mobile("samsung","2001");

        System.out.println(iphone.Model_Name);
        System.out.println(iphone.Year_of_launch);
        System.out.println(samsung.Model_Name);
        System.out.println(samsung.Year_of_launch);

        samsung.display();
        String model_name= samsung.give_me_model_name();
        System.out.println(model_name);
    }


}

class  Mobile{

    String Model_Name;
    String Year_of_launch;

    Mobile(String Model_Name,String Year_of_launch)
    {
        this.Model_Name=Model_Name;
        this.Year_of_launch=Year_of_launch;
    }

    void display()
    {
        System.out.println(Model_Name+"__"+Year_of_launch);
    }

    String give_me_model_name()
    {
        return Model_Name;
    }


}