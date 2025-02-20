package TASK.ENCAPSULATION;

public class EXP_ENCAPSULATION {

    public static void main(String[] args) {

        student s = new student();
        s.setName("ABHISHEK");
        System.out.println("NAME:"+s.getName());
        s.setAge(20);
        System.out.println("AGE:"+s.getAge());
        s.setRoll_no(9);
        System.out.println("ROLLNO:"+s.getRoll_no());
    }

}

class  student
{
    private String name;
    private int age;
    private int roll_no;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age =age;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public  void setRoll_no(int roll_no)
    {
        this.roll_no=roll_no;
    }
}