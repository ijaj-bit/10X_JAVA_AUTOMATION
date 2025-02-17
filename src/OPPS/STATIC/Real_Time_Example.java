package OPPS.STATIC;

import OPPS.Super_key.PARAM_C;

public class Real_Time_Example {
}

class ABT1{
    {
        System.out.println("IIB-THIS CALLED WHEN OBJECT IS CREATED");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    static
    {
        System.out.println("Load the classs?> i will execute");
    }
    private String name;
    private String phone;
    static String course_name="10x";

    public String getName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    void readDocuments()
    {
        System.out.println("NON STATIC METHOD:");
        System.out.println(course_name);
    }

    static void doAssignment()
    {
       // System.out.println(phone);//// Staic method can't access the non static variables
        System.out.println("ASSIGNMENT");
    }
}
